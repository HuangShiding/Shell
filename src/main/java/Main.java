import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //每次进入输入提示词”$"
            System.out.print("$ ");
            //如果输入流被关闭则正常退出，而不是报异常退出
            if(!scanner.hasNextLine())break;
            //获取输入的字符串
            String input = scanner.nextLine().trim();
            //空输入则下一轮
            if(input.isEmpty()){
                continue;
            }

            //拆分命令和参数
            String[] parts = input.split(" ",2);
            String command = parts[0];
            String argsStr = parts.length > 1 ? parts[1] : "";
            //进入命令执行分枝
            switch (command){
                case "exit" -> {
                    //要返回的参数
                    int code = 0;
                    if(!argsStr.isEmpty()){
                        try {
                            code = Integer.parseInt(argsStr.trim());
                        } catch (NumberFormatException e) {
                            //不是数字则返回0
                        }
                    }
                    System.exit(code);
                }

                case "echo" -> System.out.println(argsStr);

                default -> System.out.println(input + ": command not found");
            }
        }

    }
}
