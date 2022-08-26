import java.util.*;

public class Team {
    List<String> teamList = new LinkedList<>();

    public void ligFixturePrint() {
        if (teamList.size() % 2 != 0) {
            teamList.add("bay");
        }

        if (teamList.size() != 0) {
            System.out.println("TAKIMLAR\n");
            for (String say : teamList) {
                System.out.println("-" + say);
            }
        } else {
            System.out.println("Kayıtlı takım bulunmamaktadır.");
        }
        System.out.println();
        round();
    }

private void round(){
      List<String> teamListWeek=new LinkedList<>();

      int tur=2*(teamList.size())-1;
      List<String> teamListBackup=new LinkedList<>(teamList);
      int value=(teamList.size()/2);
        for (int i = 1; i < tur / 2 + 1; i++) {
            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBackup.get(k) + " " + teamListBackup.get(k + 1));
            }
            teamListBackup.add(1, teamListBackup.get(value));
            teamListBackup.add(value, teamListBackup.get(teamListBackup.size() - 1));
            teamListBackup.remove(teamListBackup.size() - 1);
            teamListBackup.remove(teamListBackup.size() - 2);
        }
        for (int i = tur / 2 + 2; i <= tur + 1; i++) {
            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBackup.get(k + 1) + " " + teamListBackup.get(k));
            }
            teamListBackup.add(1, teamListBackup.get(value));
            teamListBackup.add(value, teamListBackup.get(teamListBackup.size() - 1));
            teamListBackup.remove(teamListBackup.size() - 1);
            teamListBackup.remove(teamListBackup.size() - 2);
        }
        int count = 0;
        int num;

    for (int i = 1; i <= tur; i++) {

        System.out.println("-----------------------------------\nRound " + i);

        List<String> backup = new LinkedList<>();
        // he assigns matched Teams to the temporary list on a weekly basis.
        for (int n = count; n < count + value; n++) {

            backup.add(teamListWeek.get(n));

        }
       for (int m = 0; m < value; m++) {

            num = new Random().nextInt(backup.size());
            System.out.println(backup.get(num));
            backup.remove(num);


        }


        count += value;     } }}