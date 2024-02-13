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
* Based on the payment method (MasterCredit or SafePay), fill in the required details (credit number, CVV, date, name/password).
* Click "Pay Now."
* Verify the success confirmation dialog using Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/TextView.Success'), 10).

#### Issues Encountered:

1. No Internet Connection Error:
Despite a stable internet connection, the application sometimes reports "No Internet Connection." Investigate the network connectivity on the device and ensure a consistent connection.

**Evidence:**
- [Download Network Error](https://drive.google.com/file/d/1MrnftCufBckOauFP748VFf_az9COjRY8/view?usp=sharing)

3. Checkout Error - "An error occurred":
An error message is displayed during the checkout process without clear details. Examine the application logs or inspect the UI elements to identify the root cause of this issue.

5. Search Timeout Issue:
The search process takes longer than the specified timeout (10 seconds). Adjust the timeout duration in your test case to ensure it accommodates the actual search duration.

**Evidence:**
- [Download Timeout Error](https://drive.google.com/file/d/1Mp3udV7COA7pJZDKuJUJ8ynE34Vswd5w/view?usp=sharing)

## Test Suite: Profile
### 1. Test Case: Register
* Perform user registration by providing username, password, email, first name, last name, address, state, zip code, and city.
* Verify if the displayed username matches the registered username.

### 2. Test Case: Login
* Perform user login using a registered username and password.
* Verify if the displayed username matches the login username.
