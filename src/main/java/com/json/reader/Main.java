package com.json.reader;
import com.json.reader.controller.GetData;
import java.io.IOException;

import java.util.Scanner;

public class Main extends GetData{
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Shaxar nomini kiriting");
        Scanner sc = new Scanner(System.in);
        String cityname = sc.nextLine();
        System.out.println(getData(cityname));
    }
}
