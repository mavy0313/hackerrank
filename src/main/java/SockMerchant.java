public class SockMerchant {

  public static void main(String[] args) {
    int[] array = new int[]{6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
    System.out.println(sockMerchant(15, array));
  }

  static int sockMerchant(int n, int[] ar) {
    int pairsCount = 0;
    int dupsCount;
    for (int i = 0; i < n; i++) {
      if (ar[i] == -1) {
        continue;
      }
      dupsCount = 0;
      for (int j = i + 1; j < n; j++) {
        if (ar[i] == ar[j] && ar[j] != -1) {
          dupsCount++;
          ar[j] = -1;
        }
      }

      if (dupsCount > 0) {
        dupsCount++;
        pairsCount = pairsCount + (dupsCount / 2);
      }
    }
    return pairsCount;
  }

//    static int sockMerchantWithoutMap(int n, int[] ar) {
//        int pairsCount = 0;
//        int uniqueSockArray[] = new int[n];
//        Set<Integer> sockSet = new HashSet<>();
//
//        for (int i = 0; i < uniqueSockArray.length; i++) {
//            uniqueSockArray[i] = -1;
//        }
//
//        int dupsCount;
//        for (int i = 0; i < n; i++) {
////            dupsCount = 0;
//            for (int j = i + 1; j < n; j++) {
//                if (ar[i] == ar[j]) {
//                    dupsCount++;
//                    ar[j] = -1;
//                }
//            }
//            if (dupsCount > 0) {
//                dupsCount++;
//            }
//            pairsCount = pairsCount + (dupsCount / 2);
//
//        }
//        return pairsCount;
//    }
}
