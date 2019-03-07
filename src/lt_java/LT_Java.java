/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt_java;
import java.util.Scanner;
/**
 *
 * @author developer
 */
public class LT_Java {
    public static int[] nhapMang(){
        Scanner value = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = value.nextInt();
        int [] A = new int[n];
        for(int i=0;i<n;i++){
           Scanner value1 = new Scanner(System.in);
           System.out.print("A["+i+"] = ");
           A[i] = value1.nextInt();
       }
       return A;
    }
    public static void xuatMang(int a[]){
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int findMax(int a[]){
       int max = a[0];
       for(int i=1;i<a.length;i++){
           if(a[i]>max){
               max = a[i];
           }
       }
       return max;
    }
    public static int findMin(int a[]){
       int max = a[0];
       for(int i=1;i<a.length;i++){
           if(a[i]<=max){
               max = a[i];
           }
       }
       return max;
    }
    public static boolean searchArray(int a[]){
        Scanner value_x = new Scanner(System.in);
        int x = value_x.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return true;
            }
        }
        return false;
    }
    public static int find_value_in_array(int a[]){
        Scanner value_x = new Scanner(System.in);
        int x = value_x.nextInt();
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                count += 1;
            }
        }
        return count;
    }
    public static int[] delete_element_in_array(int a[]){
        Scanner value_k = new Scanner(System.in);
        int k = value_k.nextInt();
        int count = find_value_in_array(a);
        int temp = 0;
        int length_array = a.length;
        if(count !=0){
            int [] newArr = new int[a.length- count];
            for(int i = 0; i<length_array;i++){
            if(a[i] != k){
                newArr[temp] = a[i];
                temp += 1;
            }
        
        }
        return newArr;
        }
        System.out.print("Khong ton tai so can xoa trong chuoi");
        return a;
    }
    public static void insert_element_in_array(int a[]){
        Scanner value_k = new Scanner(System.in);
        int k = value_k.nextInt();
        int index = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]>k){
                index = i;
                break;
            }
        System.out.print(index);
        }
    }
    public static void revere_array(int a[]){
        for(int i =0; i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-1 -i];
            a[a.length - 1 -i] = temp;
        }
    }
    public static boolean check_revere_array(int a[]){
        for(int i =0; i<a.length/2;i++){
            if(a[i] != a[a.length-1 -i]){
                return false;
            }
        }
        return true;
    }
    
    public static void bubble_sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j= 0; j<a.length-1-i;j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = null;
        a = nhapMang();
        xuatMang(a);
//        int max = findMax(a);
//        System.out.println("So lon nhat la: " + max);
//        int min = findMin(a);
//        System.out.println("So nho nhat la: " + min);
//        System.out.println(searchArray(a));
//        System.out.println("So lan xuat hien so can tim la" +find_value_in_array(a));
//        int [] b = delete_element_in_array(a);
//        xuatMang(b);
//        bubble_sort(a);
//        xuatMang(a);
        revere_array(a);
        xuatMang(a);
    }
    
}
