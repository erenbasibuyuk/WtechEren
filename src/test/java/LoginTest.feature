Feature: Login Test

  Scenario: Go to hepsiburada website and test login page

    Given Go to Hepsiburada website
    And Click Giris Yap button
    And Type username
    And Type password
    When Click Giris button
    Then Check the Cart for fee
    And Go Back to Main Page
    And Select Random Category
    And Click Random Dropdown Category
    And Select Random Brand
    And Put Value
    And Select Random Product
    And Check The Price
    And Add to Cart
    And Check The Count
    And Add Two More Time
    And Check Last Price
    And Finish Shopping
    And Add New Address Button
    And Add Address Info
    And Add Credit Card Info
    And Go to Basket
    And Delete Items
    Then Delete Address