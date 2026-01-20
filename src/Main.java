//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var x = 4;
        var result = dog+x;
        var result2 = cat+x;
        var result3 = paper+x;

        System.out.println (result);
        System.out.println (result2);
        System.out.println (result3);

        var y = 3.5;
        var q = 1.6;
        var w = 7639;

        var result4 = dog-y;
        var result5 = cat-q;
        var result6 = paper-w;

        System.out.println (result4);
        System.out.println (result5);
        System.out.println (result6);

        var friend = 19;
        var a = 2;
        var b = 7;

        var result7 = friend+a;
        System.out.println (result7);
        System.out.println (result7/b);

        var frog = 3.5;
        var c = 10;
        var v = 4;

        var result8 = frog*c;
        System.out.println (result8);
        System.out.println (result8/frog);
        System.out.println ((result8/frog)+v);

        var oneBoxer = 78.2;
        var secondBoxer = 82.7;

        var totalWeight = oneBoxer+secondBoxer;
        System.out.println ("Общая масса бойцов = " + totalWeight);

        var differenceWeight = secondBoxer-oneBoxer;
        System.out.println ("Разница в массе бойцов = " + differenceWeight);

        var overload = (secondBoxer%oneBoxer);
        System.out.println ("Остаток деления = " + overload);

        var time = 640;
        var workingHours = 8;
        var workers = time/workingHours;

        System.out.println ("Всего работников в компании = " + workers+ " человек!");

        var human = 94;
        var allWorkers = workers+human;
        System.out.println ("Если в компании работает " + allWorkers+ " человека "+ " то всего " + allWorkers*workingHours+ " часов работы может быть поделено между сотрудниками.");







    }
    }
