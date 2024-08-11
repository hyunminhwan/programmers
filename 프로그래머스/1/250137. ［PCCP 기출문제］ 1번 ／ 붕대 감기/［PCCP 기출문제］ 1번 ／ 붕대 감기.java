class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth=health;
        int count = 0;
        int attacks_index=0;
        for(int i=0;i<=attacks[attacks.length-1][0];i++){
                count++;
               if(attacks_index < attacks.length && attacks[attacks_index][0] == i){
                   count = 0;
                   health -=attacks[attacks_index++][1];
                    if(health<=0){
                        return -1;
                    }
               }else{
                   if(health<maxHealth){
                        health+=bandage[1];
                        if(count==bandage[0]){
                            health+=bandage[2];
                            count=0;
                            
                        }
                       if(health>maxHealth){
                            health=maxHealth;
                        }
                    }
               }
        }
        if(health<=0){
            health=-1;
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