package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Is the car silent when you turn the key? " );
        char ans = sc.nextLine().charAt(0);

        if (ans == 'y'){
            System.out.print( "Are the battery terminals corroded? " );
            ans = sc.nextLine().charAt(0);

            if(ans == 'y'){
                System.out.print( "Clean terminals and try again.");
            }

            else if(ans == 'n'){
                System.out.print( "Replace cables and try again.");
            }
        }

        else if(ans == 'n'){
            System.out.print( "Does the car make a slicking noise? " );
            ans = sc.nextLine().charAt(0);

            if(ans == 'y'){
                System.out.print( "Replace the battery. " );
            }

            else if(ans == 'n'){
                System.out.print( "Does the car crank up but fail to start? " );
                ans = sc.nextLine().charAt(0);

                if(ans == 'y') {
                    System.out.print("Check the spark plug connections. ");
                }

                else if (ans == 'n'){
                    System.out.print( "Does the engine start and then die? " );
                    ans = sc.nextLine().charAt(0);

                    if(ans == 'y'){
                        System.out.print( "Does your car have fuel injection? " );
                        ans = sc.nextLine().charAt(0);

                        if(ans == 'y'){
                            System.out.print("Get it in for service.");
                        }

                        else if(ans == 'n'){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }

                    else if (ans == 'n'){
                        System.out.print( "This should not be possible. " );
                    }
                }
            }
        }
    }
}
