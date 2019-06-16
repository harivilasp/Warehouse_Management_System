# Warehouse Management System
<b>ABSTRACT</b>     

Warehouse Management System is a AWT based Desktop Application. Different Users involved here can view stock details, order details , sales .By using this tool automatically the users knew the details of the stock , order and purchases .When ever the customer purchases the product the WareHouse Management System automatically updates the stock of the product. So, WareHouse Management System is very useful to the users to maintain the details about the products.     

It is very useful for users to know about the products stock, orders and sales when ever they want to check easily and it takes less time.In mandatory checking they have to maintain many files and it takes much time to check about particular product sales and all the details. So to overcome the problems in the mandatory maintainense, the WareHouse Management System can give the fast and accurate checking of the product details in less time.

<b>INTRODUCTION</b>

The evolution of warehouse management systems (WMS) is very similar to that of many other software solutions.  Initially a system to control movement and storage of materials within a warehouse, the role of WMS is expanding to including light manufacturing, transportation management, order management, and complete accounting systems.  To use the grandfather of operations-related software, MRP, as a comparison, material requirements planning (MRP) started as a system for planning raw material requirements in a manufacturing environment.  Soon MRP evolved into manufacturing resource planning (MRPII), which took the basic MRP system and added scheduling capacity planning logic. Eventually MRPII evolved into enterprise resource planning (ERP), incorporating all the MRPII functionality with full financials and customer and vendor management functionality.  Now, whether WMS evolving into a warehouse-focused ERP system is a good thing or not is up to debate.  What is clear is that the expansion of the overlap in functionality between Warehouse Management Systems, Enterprise Resource Planning, Distribution Requirements Planning, Transportation Management Systems, Supply Chain Planning, Advanced Planning and Scheduling, and Manufacturing Execution Systems will only increase the level of confusion among companies looking for software solutions for their operations.

Even though WMS continues to gain added functionality, the initial core functionality of a WMS has not really changed.  The primary purpose of a WMS is to control the movement and storage of materials within an operation and process the associated transactions.  Directed picking, directed replenishment, and directed putaway are the key to WMS.  The detailed setup and processing within a WMS can vary significantly from one software vendor to another, however the basic logic will use a combination of item, location, quantity, unit of measure, and order information to determine where to stock, where to pick, and in what sequence to perform these operations.

<b>Existing System:</b>

Existing system is a manual one in which users are maintaining books to store the information like product details, Distributors details, purchases, sales details and accounts for every month. It is very difficult to maintain historical data.  

<b>DISADVANTAGES:</b>

The following are the disadvantages of the existing system

·   It is difficult to maintain important information in books.

·   More manual hours need to generate required reports.

·   It is tedious to manage historical data which needs much space to keep all the

Stock Details,Order Details under time to time process.

<b>Proposed System:</b>

The WAREHOUSE MANAGEMENT TOOL is a software application which avoids more manual hours that need to spend in record keeping and generating reports. This application keeps the data in a centralized way which is available to all the users simultaneously. It is very easy to manage historical data in database. No specific training is required for the distributors to use this application. They can easily use the tool that decreases manual hours spending for normal things and hence increases the performance. It is very easy to record the information of online sales and purchases in the databases.

<b>PROJECT MODULES</b>

·  Administrator

·  Sublocation Incharger

·  Supplier

·  Retailer

·  Customer

<b>MODULE DESCRIPTION</b>

Name of the module-1: Administrator.

Description: This module helps us to register user. The Administrator has the privilege to maintain different types of items in the warehouse. He is concerned with registration of Suppliers, Sub-Location In-charges.  He maintains the reports of suppliers who are eligible to supply the items. He can send the purchase order to above suppliers when items are required. He is responsible to add receipts when items delivered to the warehouse

Submodules:

Supplier Details.

Sublocation incharger details

Stock Details

Order Details

login:

The registered user can view to his assigned tasks.

Supplier Details:

 Here Administrator can view the supplier details like about their contact details and their supplied product details.If he satisfied then he allocates order to that supplier.

Sublocation Incharger Details:

Here he can view the orders given by sub location inchargers.If he have sufficient stock then he assigned goods or products and decrement in his stock.

Stock Details:

Here he can view the current stock details.

Order Details:

Here he can view the orders which are initiated by him previous movements.

Name of the module-2: Sublocation Incharger

Description: This module helps us Sub-location In-charge is registered and verified by the administrator. He is responsible to maintain the items for transferring them to Retailers on demand.   He can send purchase order to Administrator for getting items that are required for retailers. He can ship the items to retailer when he got the purchase order from retailer.   He deals with generating reports on items, orders and stock etc.

Submodules:

·  View Stock

·  Set Order

·  Retailer Orders

View Stock:

Here he can view the stock details and through that he can be set new orders.

Set Order:

If he has no sufficient stock then he set new order to administrator.

Retailer Orders:

Here he can view the retailer details who were assigned orders and decrement in his stock if he assigned order.

Name of the module-3: Supplier

Description: This module helps us to the supplier supplies the items based on the order provided by the administrator.

Submodules:

·  View Orders

·  Sending Stock

View Orders:

Here Supplier view at his orders which are initiated by administrator and decrement in his stock after assigning stock.

Sending Stock:

It displays the stock details which are send by him at previous stage.

Name of the module-4: Retailer

Description: This module helps us to retailer is registered and verified by sub-location in-charge. He is responsible to maintain the items for selling to customers.   He can send purchase order to Sub-location In-charge for getting items that are required for customers.   He deals with generating reports on items, orders, bills and stock etc.

Submodules:

·  New Orders.

·  Stock Details

New Orders:

Here he set order according to his stock and demand.

Stock Details:

It displays the stock details which he has currently.

Name of the module-5: Customer

Description: This module helps us to the customer receives the bills from the retailer based on his purchases.

Submodules:

·  View Products.

View Products:

Here Customer is allowed to view the product details like their costs.If he satisfied he can purchase by specifying quantity how much he required.After initiating these details bill is generated.

System Specifications

<b>Software Requirements: -</b>


·  Programming  language:   Java

·  Front-End:  Java AWT

·  Back-End:   MYSQL Server
