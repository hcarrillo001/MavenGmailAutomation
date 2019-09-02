package com.hcarrill.mavengmailautomation;

import java.io.File;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.base.Function;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carri
 */


public class GmailAutomation {
    public static void main(String[] args){
        //System.out.println("Hello World");
         try{
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\carri\\Desktop\\AutomationSelnium\\chromedriver.exe");
             WebDriver driver = new ChromeDriver(); 

             driver.navigate().to("http://mail.google.com");
             //type email/username
             driver.findElement(By.cssSelector("#identifierId")).sendKeys("fridayautomation@gmail.com");
             //next button
             driver.findElement(By.cssSelector("#identifierNext")).click();
             //type password
             
             Thread.sleep(5000);
             
             driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("jarvis12345");
             //next button
             driver.findElement(By.cssSelector("#passwordNext")).click();
             
             Thread.sleep(10000);
             
             
             int testNumber = 1;
             int numberOfEmails = 50;
             for (int i = 0; i < numberOfEmails; i++) {
                 System.out.println("Test number: " + testNumber);
                driver.findElement(By.xpath("//*[@role='button' and text()='Compose']")).click();

                Thread.sleep(2000);

                driver.findElement(By.xpath("//*[@role = 'combobox' and @aria-label='To']")).sendKeys("emailDumpTest2@gmail.com");
                Thread.sleep(1000);

                driver.findElement(By.xpath("//*[@name = 'subjectbox' and @placeholder = 'Subject']")).sendKeys("Testing " + testNumber);
                Thread.sleep(2000);

                driver.findElement(By.xpath("//div[@class='Ar Au']//div")).sendKeys("Testing Email " + testNumber);
                Thread.sleep(1000);

                driver.findElement(By.xpath("//*[@role='button' and text()='Send']")).click();
                testNumber++;
                Thread.sleep(5000);
             }
             
             //testing gitgit
             
             driver.close();
             driver.quit(); 
        }catch(Exception exception){
            System.out.println("Error: " + exception);
        }
        
        
    }
    
}
