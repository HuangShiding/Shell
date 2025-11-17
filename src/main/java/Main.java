import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //每次进入输入提示词”$"
            System.out.print("$ ");
            //获取输入的指令
            String command = scanner.nextLine();
            //去除前后空格
            command = command.trim();
            //内置的退出指令“exit”
            if("exit 0".equals(command))break;
            //内置的打印指令”echo“
            if(command.startsWith("echo")){
                System.out.println(command.substring(4).trim());
            }
            //如果未能匹配指令，输出指令未找到
            System.out.println(command + ": command not found");
        }

    }
}
