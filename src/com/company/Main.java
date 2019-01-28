package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scanner = new Scanner(System.in);
    //Simple
    float amount, principalAmount, interestAmount, rateOfInterest, timeInYears;
    System.out.println("Enter the initial deposit or loan amount (in Ksh) : ");
    principalAmount = scanner.nextFloat();
    System.out.println();
    System.out.println("Enter the interest amount  (in Ksh) : ");
    interestAmount = scanner.nextFloat();
    System.out.println("Enter the rate of interest per year (in decimal) : ");
    rateOfInterest = scanner.nextFloat();
    System.out.println("Enter the time period involved (in years) : ");
    timeInYears = scanner.nextFloat();

    amount = principalAmount * (1 + (rateOfInterest * timeInYears));

    System.out.println("the amount is (in Ksh) : " + amount);

    // Simple in C++
  /**  #include <iostream>
    using namespace std;
    int main(){
      double rates = 0.03;
      double investment;
      int numberOfYear;
      double interests;

      cout<<"Enter the amount to invest : ";
      cin>>investment;
      cout<<"Enter number of years for investment:";
      cin>>numberOfYear;
      interests = investment * rates * numberOfYear;
      cout<<"The interest is : " <<interests<<endl;
      return 0;
    }*/
  }


}
