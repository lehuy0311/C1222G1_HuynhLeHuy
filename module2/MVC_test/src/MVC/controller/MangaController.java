package MVC.controller;

import MVC.service.impl.IMangaService;
import MVC.service.impl.MangaService;

import java.util.Scanner;

public class MangaController {
    private IMangaService iMangaService = new MangaService();

    public void menuManga() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm truyện ");
            System.out.println("3. Tìm kiếm gần đúng");
            System.out.println("4. Xóa truyện theo mã");
            System.out.print("Mời bạn chọn ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMangaService.displayAll();
                    break;
                case 2:
                    iMangaService.addManga();
                    break;
                case 3:
                    iMangaService.searchManga();
                    break;
                case 4:
                    iMangaService.deleteStudent();
                    break;
            }
        } while (choice >= 1 || choice <= 4);
    }
}
