# cmpe202 lab4

CRC Cards :

Class : Customer

Responsibilities                                                                 Collaborators

Signup with Restaurant with his name, mobile number, number of people             DinTaiFungRestaurant

he should confirm/cancel his table when table is ready by sending                 DinTaiFungRestaurant
text message

Empty table when they are done eating                                              DinTaiFungRestaurant

Update his waitlist number

				
        
Class :DinTaiFungRestaurant

Responsibilities                                                                 Collaborators

Register customers and send him text message with availability status            Customer

Check for the table availability and put him to waitlist if no table              TableChecker
is free, or confirm table                

Observe the state of table checker for empty tables and update                    Customer
customers wait list   

send customer table ready message when his waitlist number is zero                Customer

Receive confirm/leave messages from customer and update tablechecker              TableChecker

Deregister customers when they emptied table or they leave wait queue




Class : TableChecker

Responsibilities                                                                 Collaborators
Stores available tables and occupies tables list                                 

Check table availability and returns waitlist number to restaurant                DinTaiFungRestaurant

update available tables and occupied tables when customer leaves table 
and notify Restaurant about availablity                                            DinTaiFungRestaurant


				

Design pattern used : Observer pattern 

->In the above design , I have used observer pattern where customers are observers and
subject is DinTaiFungRestaurant which notifies and updates its customer waitlist number whenever table gets free.				





					

