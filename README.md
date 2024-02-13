# Final Project - Mobile

## Overview
This project utilizes Katalon Studio for mobile automation testing on the Advantage Ecommerce Android application. The project includes 4 test cases and 2 test suites.

## Test Suite: Checkout
### 1. Test Case: Search and Checkout
* Launch the application.
* Login to the app.
* Verify if the displayed username matches the login username.
* Search for an item and select it.
* Add the item to the cart.
* Navigate to the cart and proceed to checkout.
* Based on the payment method (MasterCredit or SafePay), fill in the required details:
  ```
  if(paymentMethod.equalsIgnoreCase("mastercredit")) {
  	Mobile.tap(findTestObject('Object Repository/Checkout/ImageView.MasterCredit'), 0)
  	
  	Mobile.tap(findTestObject('Object Repository/Checkout/RelativeLayout.CVV'), 10)
  	Mobile.setText(findTestObject('Object Repository/Checkout/EditText.CVV'), "541", 10)
  	
  	Mobile.tap(findTestObject('Object Repository/Checkout/RelativeLayout.CardName'), 10)
  	Mobile.setText(findTestObject('Object Repository/Checkout/EditText.CardName'), "Aqua Botol", 10)
  	
  	Mobile.tap(findTestObject('Object Repository/Checkout/TextView.APPLY'), 10)
  }else if(paymentMethod.equalsIgnoreCase("safepay")) {
  	Mobile.tap(findTestObject('Object Repository/Checkout/RelativeLayout.SafePayUsername'), 10)
  	Mobile.setText(findTestObject('Object Repository/Checkout/EditText.SafePayUsername'), "AquaBotol1", 10)
  	
  	Mobile.tap(findTestObject('Object Repository/Checkout/RelativeLayout.SafePayPassword'), 10)
  	Mobile.setText(findTestObject('Object Repository/Checkout/EditText.SafePayPassword'), "TheAquaBotol1", 10)
  
  	Mobile.tap(findTestObject('Object Repository/Checkout/TextView.SafePayAPPLY'), 10)
  }
  ```
* Click "Pay Now."
* Verify the success confirmation dialog using Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/TextView.Success'), 10).

### 2. Test Case: Search
* Perform a search for an item using data binding.
  - Bind the item data to a local variable named "item."
* Launch the application.
* Login to the app.
* Verify if the displayed username matches the login username.
* Search for the item obtained from data binding.
* Verify the search results.

#### Issues Encountered:

1. **No Internet Connection Error:**
   Despite a stable internet connection, the application sometimes reports "No Internet Connection." Investigate the network connectivity on the device and ensure a consistent connection.

   **Evidence:**
   - [Download Network Error](https://drive.google.com/file/d/1MrnftCufBckOauFP748VFf_az9COjRY8/view?usp=sharing)

2. **Checkout Error - "An error occurred":**
   An error message is displayed during the checkout process without clear details.

3. **Search Timeout Issue:**
   The search process takes longer than the specified timeout (10 seconds). 

   **Evidence:**
   - [Download Timeout Error](https://drive.google.com/file/d/1Mp3udV7COA7pJZDKuJUJ8ynE34Vswd5w/view?usp=sharing)

## Test Suite: Profile
### 1. Test Case: Register
* Perform user registration by providing username, password, email, first name, last name, address, state, zip code, and city.
* Verify if the displayed username matches the registered username.

### 2. Test Case: Login
* Perform user login using a registered username and password.
* Verify if the displayed username matches the login username.
