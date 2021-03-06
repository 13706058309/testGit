package com.test;
//递归迷宫
public class MiGong {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];

        for(int i=0;i<8;i++){
            arr[i][0] = 1;
            arr[i][6] = 1;
        }

        for(int i=0;i<7;i++){
            arr[0][i] = 1;
            arr[7][i] = 1;
        }

        arr[3][2] = 1;
        arr[3][1] = 1;
        arr[3][4] = 1;
        arr[3][5] = 1;

        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        setWay2(arr,1,1);
        System.out.println("------------------------");
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean setWay(int[][] map, int i, int j){
        if(map[6][5]==2){
            return true;
        }else{
            if(map[i][j]==0){
                map[i][j] = 2;
                if(setWay(map,i-1,j)){
                    return true;
                }else if(setWay(map,i,j+1)){
                    return true;
                }else if(setWay(map,i+1,j)){
                    return true;
                }else if(setWay(map,i,j-1)){
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }


    }

    public static boolean setWay2(int[][] map,int i,int j){
        if(map[6][5]==2){
            return true;
        }else{
            if(map[i][j]==0){
                if(setWay(map,i+1,j)){
                    return true;
                }else if(setWay(map,i,j+1)){
                    return true;
                }else if(setWay(map,i-1,j)){
                    return true;
                }else if(setWay(map,i,j-1)){
                    return true;
                }else{
                    map[i][j]  = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
