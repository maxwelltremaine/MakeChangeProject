# Makechange

# Description
My program will take an input for the price of an item and the payment as double values, it will then take the payment received and compare it against the item price. If the price and the payment are the same my code will output a message thanking the customer. If the payment is less than the price it will print out an error message that will call the customer silly, tell them they're payment is short and tell them by how much their payment is short.
If the payment is greater than the purchase, my code will first subtract the price from the payment then multiply by 100 and will be redefined as changeDue, this allows for the system to deal with whole numbers making it easier to deal with the values. My code will then run an "if" statement chain where changeDue will be divided by a denomination which was multiplied by 100 from highest to lowest, for example a 20 dollars is changed to 2000, this division will result in the variable numOfDem, the number of that denomination that will need to be returned to the customer. If the division results in anything less than 1 it will not show this denomination in the final printout. It will then run changeDue%20 which will give us the remainder which wasn't able to be resolved with the higher denomination, this remaining value will then be defined as the variable changeDue for the next "if" statement checking a denomination. It will continue to execute this process until all remainders are gone. It will then print out a statement stating the customers change per denomination, then conclude with a Thank You. 

# Technologies used
The technologies used were as follows, 
a scanner for user input.
Double and int to define the values. 
Casting to change the value from double to int when dealing with returning change.
System print and system print line next to out put the results in a manner that allows for the user to read. 
"If" statements to create a variable to meet for the proper response triggers, and if statements within an else if statement so that the proper change for each denomination could be output.
Division, multiplication, modulo, less than, greater than, equal to, and greater than or equal to.

# Lessons learned# MakeChangeProject
The main Lesson I learned was that you can make if statements within if statements, and in cases like this if the value for a variable is changed within an if statement those changes will carry over to the next if in the consecutive line of if statements. 