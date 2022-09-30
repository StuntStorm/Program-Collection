# Importing pyqrcode library
import pyqrcode

#  Set QR code website url
website = "https://durgesh716.github.io/Portfolio-Website/"

#  Generate qr code
url = pyqrcode.create(website)

#  Save QR code
url.svg("DurgeshQR.svg", scale=8)
