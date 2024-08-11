class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth=health;
        int count = 0;
        int attacks_index=0;
        for(int i=0;i<=attacks[attacks.length-1][0];i++){
                count++; //연속 회복 체크
               if(attacks_index < attacks.length && attacks[attacks_index][0] == i){
                   count = 0; // 공격당했을때 다시 0으로 초기화
                   health -=attacks[attacks_index++][1]; //공격피해량 감소
                    if(health<=0){
                        return -1; // 피가 0이되면 -1 을 리턴
                    }
               }else{
                   if(health<maxHealth){
                        health+=bandage[1]; //공격 받지 않을때 +1 씩 체력증가
                        if(count==bandage[0]){
                            health+=bandage[2]; // 연속회복 성공시 + bandage[2] 만큼 추가 증가
                            count=0; // 다시 0으로 초기화
                            
                        }
                       if(health>maxHealth){
                            health=maxHealth; // 피가 더 많이 찻을때 최대치로 변경
                        }
                    }
               }
        }
        if(health<=0){
            health=-1;
            //총피해량이 0이하일시 -1 리턴
        }
        return health;
    }
}
//t초 동안  x만큼 체력을 회복
//연속으로 붕대 감기 성공 y만큼 추가로 회복
//공격당하면 기술 취소, 당하는순간 체력회복 x
//연속성공 시간0
//bandage에 기술의 시전시간, 1초당 회복량=x 추가 회복량=y
//health 최대 체력
//attacks에 몬스터 공격시간과 피해량 
//남는체력 return , 체력이 0이하 -1 return