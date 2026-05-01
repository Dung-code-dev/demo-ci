package com.lab.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application class for CI/CD Demo.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    // Thêm private constructor để fix lỗi HideUtilityClassConstructor
    private App() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Hàm main để chạy chương trình.
     *
     * @param args Các tham số dòng lệnh
     */
    public static void main(String[] args) {
        logger.info("Starting Application...");
        int result = add(5, 10);
        logger.info("Result is: {}", result);
    }

    /**
     * Hàm cộng hai số nguyên.
     *
     * @param numA Số hạng thứ nhất (đã đổi tên từ 'a')
     * @param numB Số hạng thứ hai (đã đổi tên từ 'b')
     * @return Tổng của hai số
     */
    public static int add(int numA, int numB) {
        return numA + numB;
    }
}