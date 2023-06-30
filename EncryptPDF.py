import glob
from PyPDF2 import PdfReader, PdfWriter
import sys
import os

# Check if the correct number of arguments is provided
#Copy all PDFs to current python dir and run --> .\EncryptPDF.py <PASSWORD> *.pdf
#

if len(sys.argv) < 3:
    print("Usage: python encrypt_pdf.py <password> <file1> <file2> ... *.pdf")
    sys.exit(1)

password = sys.argv[1]
file_args = sys.argv[2:]

files = []

for file_arg in file_args:
    if file_arg == "*.pdf":
        files.extend(glob.glob("*.pdf"))
    else:
        file_arg = file_arg.strip()
        if not file_arg.endswith('.pdf'):
            file_arg += '.pdf'

        if os.path.isfile(file_arg):
            files.append(file_arg)
        else:
            print("File does not exist:", file_arg)

for file_name in files:
    reader = PdfReader(file_name)
    writer = PdfWriter()

    for page in reader.pages:
        writer.add_page(page)

    writer.encrypt(password)

    encrypted_file_name = file_name.replace(".pdf", "_encrypted.pdf")

    with open(encrypted_file_name, "wb") as f:
        writer.write(f)

    print("PDF file encrypted successfully. Encrypted file saved as:", encrypted_file_name)
