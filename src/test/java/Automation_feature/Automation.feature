Feature: Dress Purchase In Automation Application

Background: Login page
        Given user Launch The Application
        When user Click The Sign In Button
        And user Enter The "nivi123456@gmail.com" In The Email Field
        And user Enter The "123456" In The Password Field
        Then user Click On The Sign In Button And It Navigate To Home Page

       
Scenario: Women Dress Purchase
       When user Click On The Women Button
       And user Select the Dress 
       And user Select The Quantity Of Dress
       And user Select The Dress Size
       And user Select The Dress Colour
       And user Click On The Add To Cart Button
       And user Click On The Proceed To Checkout Button  
       And user Click On The Sign in Proceed To Checkout Button 
       And user Click On The  Address Proceed To Chekout Button
       And user Click On The Terms Of Service Check Box
       And user Click To Choose The Payment Type
       And user Click On The Payment Proceed To CheckOut
       And user Click On The I Confirm My Order Button 
       Then user Click On The Sign Out Button And It Navigate To Home Page
               
Scenario: Dresses Purchase
      When user Click On The Dresses Button
      And user Click On The Dress Type
      And user Select The Dress 
      And user Click The Quantity Button
      And user Click The Size 
      And user Click The Colour
      And user Click Add To Cart Button
      And user Click the Summary Proceed To CheckOut Button
      And user Click The Sigin Proceed To Checkout Button
      And user Click The Address Proceed To CheckOut Button
      And User Click The Terms Of Service Box
      And user Click The Payment Type
      And user Click The Payment Proceed To CheckOut
      And user Click The Order Conformed Button
      Then User Click The SignOut Button It Navigate To Home Page    
        
Scenario: Tshirts Purchase
      When user Click On The Tshirts Button 
      And user Click On The Dress 
      And user Select The Quantity Of Dress
      And user Select The Dress Size
      And user Select The Dress Colour
      And user Click On Add To Cart Button
      And user Click On Summary Proceed To Checkout Button
      And user Click On SignIn Proceed To Checkout Button 
      And user Click On Address Proceed To Checkout Button
      And user Click On The Terms Of Service Check Box
      And user Click To The Payment Type
      And user Click To Payment Proceed To CheckOut
      And user Click On I Confirm My Order Button 
      Then user Click On Sign Out Button And It Navigate To Home Page



