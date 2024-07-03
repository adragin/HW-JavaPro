package com.telran.Homework_20240607;

import com.telran.Homework_20240607.mvp.model.Model;
import com.telran.Homework_20240607.mvp.presenter.Presenter;
import com.telran.Homework_20240607.mvp.view.ConsoleView;
import com.telran.Homework_20240607.mvp.view.View;

public class App {
    public static void run(){
        View view = new ConsoleView();
        Model model = new Model();
        Presenter pres = new Presenter(model, view);

        StringBuilder sb = new StringBuilder()
                .append("\n -== MENU ==- \n")
                .append("1 - append shape\n")
                .append("2 - show last shape\n")
                .append("3 - show all shapes\n")
                .append("0 - exit\n");

        while (true) {
            view.print(sb.toString());
            int choice = Integer.parseInt(view.get());
            switch (choice) {
                case 1:
                    pres.append();
                    break;
                case 2:
                    pres.printLast();
                    break;
                case 3:
                    pres.printAll();
                    break;
                case 0:
                    return;
            }
        }
    }
}
