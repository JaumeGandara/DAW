public class Exemple_10_2_ArraySorteig {
    public static void main(String[] args) {

        //Sondeix equip vs equip

        String[] ulGroupRunner = {"Manu","Nantes","Union Berlin","PSV","Monaco","AS Roma","Hillian","Rennes"};
        String[] uclThirdRankedList = {"Ajax","FCB","Salburg","Sevilla","Leverkusen","Sporting Lisboa","Shaktar","Juventus"};

        int[] bombo1 = new int[ulGroupRunner.length];
        int[] bombo2 = new int[uclThirdRankedList.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < ulGroupRunner.length; i++) {
            do {
                index1 = (int)(Math.random()*8);
            }while(bombo1[index1] == 1);

            do {
                index2 = (int)(Math.random()*8);
            }while(bombo2[index2] == 1);

            System.out.println((i+1) + ".- S'enfrentaràn " + ulGroupRunner[index1] + " vs " + uclThirdRankedList[index2]);
            bombo1[index1] = 1;
            bombo2[index2] = 1;
        }
    }
}
