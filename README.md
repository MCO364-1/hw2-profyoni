# 364_2_Multithreading_SumInts


Write a program that has 10 threads running simlatenously and each will count from 1 to 10,0000000
and ...

1. add 1 to a  local  variable (no sleeping) and output the total. It should total 10,000,000
2.  Then have each thread also add 1 to a shared static variable. it should total 100,000,000, but will often not.
3.  Create a unit test that confirms that each thread's total equals 10,000,000
4.  Create a unit test that confirms that the static variable total equals a number between 99,999,000 and 100,000,000
5. Write in a comment at the top of your program why the grand total may not always equal 100,000,000
6. Add Travis link as in last homework
