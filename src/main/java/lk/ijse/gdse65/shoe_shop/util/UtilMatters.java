package lk.ijse.gdse65.shoe_shop.util;

import lk.ijse.gdse65.shoe_shop.entity.enums.Gender;
import lk.ijse.gdse65.shoe_shop.entity.enums.Occasion;

import java.util.Base64;
import java.util.UUID;


public class UtilMatters {
    public static String generateId(){
        UUID uuid = UUID.randomUUID();
        byte[] uuidBytes =new byte[16];
        long msb = uuid.getMostSignificantBits();
        long lsb = uuid.getLeastSignificantBits();
        for (int i = 0; i < 8; i++) {
            uuidBytes[i] = (byte) ((msb >> (8 * (7 - i))) & 0xFF);
            uuidBytes[8 + i] = (byte) ((lsb >> (8 * (7 - i))) & 0xFF);
        }
        return Base64.getUrlEncoder().withoutPadding().encodeToString(uuidBytes);
    }
    public static String convertBase64(byte[] data){
        return Base64.getEncoder().encodeToString(data);
    }
    public static String generateItemId(long itemCount, Occasion occasion, Gender gender) {

        String itemNum = "000001";

        if (!(itemCount == 0)){
            long maxItemCode = itemCount;
            itemNum = String.format("%06d", maxItemCode + 1);
        }

        String[] occArr = {"FS", "CS", "IS", "SS"};
        String[] genArr = {"M", "F", "O"};

        String occId = null;
        String genId = null;


        switch (occasion) {
            case SPORT:
                occId = occArr[3];
                break;
            case INDUSTRIAL:
                occId = occArr[2];
                break;
            case CASUAL:
                occId = occArr[1];
                break;
            case FORMAL:
                occId = occArr[0];
                break;
        }
        switch (gender) {
            case MALE:
                genId = genArr[0];
                break;
            case FEMALE:
                genId = genArr[1];
                break;
            case OTHER:
                genId = genArr[2];
                break;
        }
        String itemID = occId + genId + itemNum;
        return itemID;
    }



}
