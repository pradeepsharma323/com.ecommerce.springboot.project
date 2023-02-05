Under this project i have tried to create an e-commerce application
where are are expecting end user are able to add product into cart
able to checkout product from the cart and place their order.


****************** Here Setup Spring boot project with H2 DB *************

#  Create Controller 
#  Create Model/Entity class
#  Service class 
#  Repositories
#  Application.properties that has H2 DB Details.

******************* Post Man End Points *****************

1.To Add Product into Cart
  Post>>>localhost:8080/restApi/addToCart
  Body
    {
    "productName":"Nike Shoes",
    "amount":"$10",
    "quantity":"1",
    "disc":"Brand new nike shoes"
    }
2. Retrieve Cart Product
   Get>>>localhost:8080/restApi/getCartItem

3. Checkout CartItem Here all expecting request body will come from front end.
   Post>>>localhost:8080/restApi/checkoutItem
   Body
   {
   "productId": "23",
   "paymentStatus": "No",
   "product": [{
   "productName": "John",
   "amount": "@1200",
   "quantity": "1",
   "disc": "Brand new list"
   },{
   "productName": "Pradeep",
   "amount": "@1200",
   "quantity": "1",
   "disc": "Brand new list"
   },
   {
   "productName": "Anmol",
   "amount": "@1200",
   "quantity": "1",
   "disc": "Brand new list"
   }

   ]
   }


4. Place Order Request
   Post>>>localhost:8080/restApi/placeOrder
   {
   "customerName": "Pradeep",
   "address": "Delhi",
   "phone": "1928928191",
   "checkOutItem": [{
   "productId": "387289",
   "paymentStatus": "@1200",
   "products": [{
   "productName": "Iphone14",
   "amount": "@1200",
   "quantity": "1",
   "disc": "Brand new list"
   },
   {
   "productName": "Shoes",
   "amount": "@1200",
   "quantity": "1",
   "disc": "Brand new list"
   }
   ]
   }]
   }