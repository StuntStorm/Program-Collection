import cv2
import numpy as np
import matplotlib.pyplot as plt

# ----------------------Q1----------------------------------
def quantize(img_1, levels):
    # different level of quantization for the grayscale image
    # Note: Reducing to two levels is thresholding, resulting in a binary image - black and white
    
    img_1 = "Lenna.png"
    image_1 = "lenna.png"
    # Reduce the default 256 levels to 32, 16, 8, 4and 2
    levels = [32, 16, 8, 4, 2] # levels of quantization
    for i in levels:
        # print(i)
        img_1 = cv2.imread(image_1, 0) # read image in grayscale
        img_1 = img_1 // (256 // i) # quantize image
        img_1 = img_1 * (256 // i) # dequantize image
        cv2.imwrite("q1Out/Lenna_{}.png".format(i), img_1) # save image
#-------------------------------Q2-------------------------------
img1_2 = "aimg1.jpg"
img2_2 = "aimg2.jpg"

def pixel_by_pixel(img1_2, img2_2):
    # pixel by pixel operation
    img1_2 = cv2.imread(img1_2) # read image as BGR
    img2_2 = cv2.imread(img2_2) # read image as BGR
    img3_2 = img1_2 + img2_2 # add images
    cv2.imwrite("q2Out/aimg3_pixel_by_pixel.jpg", img3_2) # save image

def cv2_add(img1_2, img2_2): 
    # cv2.add()
    img1_2 = cv2.imread(img1_2) # read image as BGR
    img2_2 = cv2.imread(img2_2) # read image as BGR
    img3_2 = cv2.add(img1_2, img2_2) # add images
    cv2.imwrite("q2Out/aimg3_cv2_add.jpg", img3_2) # save image

def cv2_addWeighted(img1_2, img2_2): 
    # cv2.addWeighted()
    img1_2 = cv2.imread(img1_2) # read image as BGR
    img2_2 = cv2.imread(img2_2) # read image as BGR
    img3_2 = cv2.addWeighted(img1_2, 0.5, img2_2, 0.5, 0) # add images
    cv2.imwrite("q2Out/aimg3_cv2_addWeighted.jpg", img3_2) # save image
 #-------------------------------Q3-------------------------------
img1_3 = "simg1.png" # image
img2_3 = "simg2.png"

def subtract(img1_3, img2_3):
    # Subtract the image‘simg1.png’from‘simg2.png’to extract the additional hand in the frame
    img1_3 = cv2.imread(img1_3) # read image as BGR
    img2_3 = cv2.imread(img2_3) # read image as BGR
    img3_3 = img2_3 - img1_3 # subtract images
    cv2.imwrite("q3Out/simg3_subtract.jpg", img3_3) # save image

def thresholding(img1_3, img2_3):
    # Then apply thresholding to convert to a binary image to enhance and view the difference
    # (Use cv2.threshold() and select an appropriate threshold)
    img1_3 = cv2.imread(img1_3) # read image as BGR
    img2_3 = cv2.imread(img2_3) # read image as BGR
    img3_3 = img2_3 - img1_3  # subtract images
    ret, img3_3 = cv2.threshold(img3_3, 127, 255, cv2.THRESH_BINARY) # apply thresholding
    cv2.imwrite("q3Out/simg3_thresholding.jpg", img3_3) # save image

#-------------------------------Q4-------------------------------

img_4 = "teeth.jpg"
mask_4 = "mask.jpg"
def teeth(img_4, mask_4):
    # isolate teeth with fillings
    img_4 = cv2.imread(img_4) # read image as BGR
    mask_4 = cv2.imread(mask_4) # read image as BGR
    img_4 = img_4 * mask_4 # multiply images
    cv2.imwrite("q4Out/teeth.jpg", img_4) # save image
img_5 = "ChessBoardGrad.png"
shading_5 = "shading.png"
# ------------------------------- Q5 -------------------------------
img_5 = "ChessBoardGrad.png"
shading_5 = "shading.png"

def chessboard(img_5, shading_5):
    # Obtain a corrected image without the shading by dividing the faulty image by the shading pattern
    img_5= cv2.imread(img_5) # read image as BGR
    shading_5 = cv2.imread(shading_5) # read image as BGR
    img_5 = img_5 - shading_5 # subtract images
    cv2.imwrite("q5Out/ChessBoardGrad.png", img_5) # save image
#------------------------------- Main -------------------------------
if __name__ == "__main__":
    # ------------------------------- 1 -------------------------------
    img_1 = "Lenna.png" # image
    levels = [32, 16, 8, 4, 2] # levels of quantization
    quantize(img_1, levels) # different level of quantization for the grayscale image
    print("Q1: Different level of quantization for the grayscale image")
    print("Generated images: Lenna_2.png, Lenna_4.png, Lenna_8.png, Lenna_16.png, Lenna_32.png")
    # ------------------------------- 2 -------------------------------
    pixel_by_pixel(img1_2, img2_2) # pixel by pixel operation
    cv2_add(img1_2, img2_2) # cv2.add()
    cv2_addWeighted(img1_2, img2_2) # cv2.addWeighted()
    print("Q2: Pixel by pixel operation, cv2.add(), cv2.addWeighted()")
    print("Generated images: aimg3_pixel_by_pixel.jpg, aimg3_cv2_add.jpg, aimg3_cv2_addWeighted.jpg")
    # ------------------------------- 3 -------------------------------
    subtract(img1_3, img2_3) # Subtract the image‘simg1.png’from‘simg2.png’to extract the additional hand in the frame
    thresholding(img1_3, img2_3) # Then apply thresholding to convert to a binary image to enhance and view the difference
    print("Q3: Subtract the image‘simg1.png’from‘simg2.png’to extract the additional hand in the frame, Then apply thresholding to convert to a binary image to enhance and view the difference")
    print("Generated images: simg3_subtract.jpg, simg3_thresholding.jpg")
    # ------------------------------- 4 -------------------------------
    teeth(img_4, mask_4) # isolate teeth with fillings
    print("Q4: Isolate teeth with fillings")
    print("Generated images: teeth.jpg")
    # ------------------------------- 5 -------------------------------
    chessboard(img_5, shading_5) # Obtain a corrected image without the shading by dividing the faulty image by the shading pattern
    print("Q5: Obtain a corrected image without the shading by dividing the faulty image by the shading pattern")
    print("Generated images: ChessBoardGrad.png")