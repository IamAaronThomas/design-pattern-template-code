package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("泡茶");
    }

    public void addCondiments() {
        System.out.println("添加柠檬");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("你的茶要柠檬吗 (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("尝试阅读您的答案时出现 IO 错误");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
