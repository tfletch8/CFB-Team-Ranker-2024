/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cfbranker2024;
import java.util.Scanner;
import java.util.Objects;

/**
 *
 * @author thoma
 */
public class CfbRanker2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String americanTeams[] = {"Army", "Charlotte", "East Carolina", "Florida Atlantic", "Memphis", "Navy", "North Texas",
                "Rice", "South Florida", "Temple", "Tulane", "Tulsa", "UAB", "UTSA"};
        String accTeams[] = {"Boston College", "California", "Clemson", "Duke", "Florida St.", "Georgia Tech", "Louisville", 
            "Miami (FL)", "NC State", "North Carolina", "Pittsburgh", "SMU", "Stanford", "Syracuse", "Virginia", "Virginia Tech", "Wake Forest"};
        String big12Teams[] = {"Arizona St.", "Arizona", "BYU", "Baylor", "Cincinnati", "Colorado", "Houston", "Iowa State", "Kansas", "Kansas St.",
            "Oklahoma St.", "TCU", "Texas Tech", "UCF", "Utah", "West Virginia"};
        String bigTenTeams[] = {"Illinois", "Indiana", "Iowa", "Maryland", "Michigan St.", "Michigan", "Minnesota", "Nebraska", "Northwestern", 
            "Ohio State", "Oregon", "Penn State", "Purdue", "Rutgers", "UCLA", "USC", "Washington", "Wisconsin"};
        String conferenceUSATeams[] = {"FIU", "Jacksonville State", "Kennesaw State", "Liberty", "Middle Tennessee State", "New Mexico State",
                "Sam Houston State", "UTEP", "Western Kentucky"};
        String independentTeams[] = {"UMass", "Notre Dame", "UConn"};
        String macTeams[] = {"Akron", "Ball State", "Bowling Green State", "Buffalo", "Central Michigan", "Eastern Michigan", "Kent State", "Miami (OH)",
            "Northern Illinois", "Ohio", "Toledo", "Western Michigan"};
        String mountainWestTeams[] = {"Air Force", "Boise State", "Colorado State", "Fresno State", "Hawaii", "Nevada", "New Mexico", "San Diego State",
                "San Jose State", "UNLV", "Utah State", "Wyoming"};
        String pac12Teams[] = {"Oregon State", "Washington State"};
        String secTeams[] = {"Alabama", "Arkansas", "Auburn", "Florida", "Georgia", "Kentucky", "LSU", "Mississippi State", "Missouri", "Oklahoma",
            "Ole Miss", "South Carolina", "Tennessee", "Texas A&M", "Texas", "Vanderbilt"};
        String sunBeltTeams[] = {"Appalachian State", "Arkansas State", "Coastal Carolina", "Georgia Southern", "Georgia State", "James Madison",
            "Louisiana", "Marshall", "Old Dominion", "South Alabama", "Southern Mississippi", "Texas State", "Troy", "UL Monroe"};
        String allTeams[] = new String[134];
        boolean cont = true;
        Scanner s = new Scanner(System.in);
        /*
        for (int i = 0; i < allTeams.length; i++) {
            if (i <= americanTeams.length){
                allTeams[i] = americanTeams[i];
            }
        }
        */
        while (cont) {
            System.out.println("Please enter what conference you would like to rank: ");
            System.out.println("American\nACC\nBig 12\nBig Ten\nConference USA\nIndependents\nMAC\nMountain West\nPac-12\nSEC\nSun Belt\n\nAll Teams");
            String selectedConference = s.nextLine();
            if (Objects.equals("American", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(americanTeams);
            } else if (Objects.equals("ACC", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(accTeams);
            } else if (Objects.equals("Big 12", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(big12Teams);
            } else if (Objects.equals("Big Ten", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(bigTenTeams);
            } else if (Objects.equals("Conference USA", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(conferenceUSATeams);
            } else if (Objects.equals("Independents", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(independentTeams);
            } else if (Objects.equals("MAC", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(macTeams);
            } else if (Objects.equals("Mountain West", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(mountainWestTeams);
            } else if (Objects.equals("Pac-12", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(pac12Teams);
            } else if (Objects.equals("SEC", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(secTeams);
            } else if (Objects.equals("Sun Belt", selectedConference)) {
                System.out.println(selectedConference + " teams:");
                compareTeams(sunBeltTeams);
            } else {
                System.out.println("Please enter the right conference name. Maybe a spelling error?");
            }
            System.out.println("Would you like to continue ranking another conference? Y/N?");
            String userCont = s.nextLine();
            if (Objects.equals("Y", userCont)) {
                continue;
            } else {
                break;
            }
        }
    }
    
    public static void compareTeams(String[] teams) {
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i]);
        }
    }
    
    
}
