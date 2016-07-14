/////////////////////////////////////////////////////////////////////////////////
ManagementFramework

DESCRIPTION
Framework deals with user management, checkin and checkout operations of products as its main business process.
It provides generic entity classes (Product, Customer, User) as its basic business model, and also corresponding user, customer, product and checkin/checkout record controllers along with persistance interface leaving favoured implementation for application developers.
* Business models: User, Customer, Product, CheckoutRecord, CheckoutRecordEntry
* Controllers: Controller, UserController, ProductController, CustomerController, CirculationContrller
* Persistance: Database interface

REQUIREMENTS
- jdk1.8XXX
- Netbeans IDE

INSTALLATION
* Project source:
- https://github.com/SudeepPradhan/ManagementFramework.git

CONFIGURATION
- need to include jbcrypt-0.3m into Libraries for hashing password information

ABOUT US
- Sudeep Pradhan	- project manager
- Bishal Nepal		- senior developer
- Ulugbek		- developer

CONTRIBUTIONS
- Sudeep Pradhan
	chose the sample application to do the reverse engineering from Library Management System application to the framework.
	setup the collaborative environment Git - https://github.com/SudeepPradhan/ManagementFramework
	created User and Product classes
	created whole Logging mechanism
	created Controller, UserController and ProductController
	
- Bishal Nepal
	created Inventory, DefaultInventory, CheckoutRecord and CheckoutRecordEntry classes
	created Circulation controller class
	created whole exception handling mechanism
	created Product and Customer decorator classes
	did testing

- Ulugbek
	created CustomerController class
	created Database interface as a Facade
	created Session enum type singleton for user
	created hashing mechanism for encoding the password









/////////////////////////////////////////////////////////////////////////////////
LibrarySystem
DESCRIPTION
GUI based complete Library Management System, user can log in as a Librarian who can do checkin/checkout books for library members or as an Admin who can creates users, add/edit/delete publications and add/edit/delete library members. GUI has different pages for each operation: [User], [Library Member], [Book], [Author], [Circulation].
Application has concrete type business model classes:
	- Address, Author, LibraryMember, Book, Journal, LendableCopy and Publication
Controller classes, some of the controller directly extends the framework controllers:
	- AuthorController, CirculationController, PublicationController, UserManagementController
Persistance:
	- DataManager interface, DatabaseFactory, DatabaseImpl, DatabaseSingleton and IOTool, DatabaseIO tools
View:
	- LoginPagecontroller, MainPageController
And, Validation and utilities


REQUIREMENTS
- jdk1.8XXX
- Netbeans IDE

INSTALLATION
* Project source:
- https://github.com/SudeepPradhan/LibrarySystem.git

CONFIGURATION
- need to include ManagementFramework into Libraries as a project jar file

ABOUT US
- Sudeep Pradhan	- project manager
- Bishal Nepal		- senior developer
- Ulugbek		- developer

CONTRIBUTIONS
- Sudeep Pradhan
	did Validation mechanism
	created the business model classes
	CirculationController	
	[Library Member], [Circulation] pages in javaFX
	
- Bishal Nepal
	created utility classes
	did testing
	created PublicationController class
	[Book], [Author] pages in javaFX

- Ulugbek
	developed persistance mechanism
	created UserManagementController, AuthorController
	[User], [LoginPage] pages in javaFX  
