package Crickbuzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\\\\\chromedriverexefile\\\\\\\\chromedriver_win32 (2)\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/46274/nep-vs-png-2nd-odi-papua-new-guinea-tour-of-nepal-2022");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		WebElement ss = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]"));
		// List For Player Name
		List<WebElement> list1 = ss.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div/div/a"));

		// Find Total PLAYER
		int p = list1.size();
		System.out.println("________________________________________");
		System.out.println("TOTAL PLAYER IN 1 INNING :" + p);
		System.out.println("________________________________________");
		System.out.println("");
//		for (WebElement player: list1) 
//		{
//			
//			System.out.println(" PLAYER NAME "+player.getText());
//		}

		// FIND PLAYER NAME

		for (int i = 0; i < p; i++) {
			String player1 = list1.get(i).getText();
			System.out.println(" PLAYER NAME " + (i + 1) + " :" + player1);
		}

		// List For Player RUNS
		List<WebElement> list2 = ss.findElements(By.xpath("	//*[@id=\"innings_1\"]/div[1]/div/div[3]"));
		int p2 = list2.size();

		System.out.println(" ");
		int sum = 0;
		for (int i = 1; i < p2 - 2; i++) {
			String player2 = list2.get(i).getText();
			System.out.println(" PLAYER " + (i) + " RUNS" + " :" + player2);
			int tr = Integer.parseInt(player2);
			sum = sum + tr;

		}
		System.out.println("________________________________________");
		System.out.println(" TOTAL OF ALL PLAYER RUN :" + sum);
		System.out.println("________________________________________");
		
		System.out.println(" ");
		// TOTAL RUNS
		List<WebElement> list3 = ss.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]"));
		int p3 = list3.size();
		String TotalScore = list3.get(0).getText();
		int ts = Integer.parseInt(TotalScore);
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println(" TOTAL SCORE :" + TotalScore);

		List<WebElement> list4 = ss.findElements(By.xpath("	//*[@id=\"innings_1\"]/div[1]/div[13]/div[2]"));
		int p4 = list4.size();
		String ExtraRuns = list4.get(0).getText();
		int te = Integer.parseInt(ExtraRuns);
		System.out.println(" EXTRA RUNS:" + ExtraRuns);

		if (sum + te == ts) {
			System.out.println(" TOTAL SCORE OF MATCH IS :" + ts);
		}
		System.out.println("=====================================");

		System.out.println(" ");
		// for total Ball for 11 player
		
		List<WebElement> list5 = ss.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div/div[4]"));
		int p5 = list5.size();
		List<Integer>aa=new ArrayList<Integer>();

		int sum1 = 0;
		for (int i = 1; i < p5; i++)
		{
			String player3 = list5.get(i).getText();
			System.out.println(" PLAYER " + (i) + " BALLS" + " :" + player3);
			
			int tr = Integer.parseInt(player3);
			aa.add(tr);
			sum1 = sum1 + tr;
		}
		
		System.out.println("AFTER"+aa);
		Collections.sort(aa);
		System.out.println("BEFORE"+aa);
		
		System.out.println("________________________________________");
		System.out.println(" TOTAL BALLS OF ALL PLAYER :" + sum1);
		System.out.println("________________________________________");
		
		System.out.println(" ");
		//for Total four of 11 Player 
		List<WebElement> list6 = ss.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div/div[5]"));
		int p6 = list6.size();
        
		int sum2 = 0;
		for (int i = 1; i < p6; i++)
		{
			String player4 = list6.get(i).getText();
			System.out.println(" PLAYER " + (i) + " FOUR" + " :" + player4);
			int tr = Integer.parseInt(player4);
			sum2 = sum2 + tr;
		
		}
		
		
		System.out.println("________________________________________");
		System.out.println(" TOTAL FOURS OF ALL PLAYER :" + sum2);
		System.out.println("________________________________________");
		
	

	


	}

}
