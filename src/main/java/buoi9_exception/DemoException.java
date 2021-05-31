/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9_exception;

/**
 *
 * @author tiennh
 */
public class DemoException {
    public static void main(String[] args) {
        String[] arr = new String[] { "1", "2", "a", null };
        
        for (int i = 0; i < 5; i++) {
            parse(arr[i]);
        }
    }

    private static int parse(String input) throws IndexOutOfBoundsException
    {
        try {
            int ketQua = Integer.parseInt(input);
            System.out.println("Kết quả = " + ketQua);
            
            return ketQua;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Hehe");
        }

        return 0;
    }
}
