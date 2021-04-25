public String withoutX2(String str) {
  if(str.length() == 0) return str;
  StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++){
      if(i < 2 && str.charAt(i) != 'x')   sb.append(str.charAt(i));
      if(i >= 2)    sb.append(str.charAt(i));
    }
    return sb.toString();
}

// https://codingbat.com/prob/p151359
// public String withoutX2(String str) {
//   if(str.length() == 0) return str;
//   StringBuilder sb = new StringBuilder();
//   if(str.charAt(0) == 'x' || str.charAt(1) == 'x'){
//     for(int i = 0; i < str.length(); i++){
//       if(i == 0 || i == 1){
//         if(str.charAt(i) != 'x') sb.append(str.charAt(i));
//       }else{
//         sb.append(str.charAt(i));
//       }
//     }
//     return sb.toString();
//   }
//   else
//     return str;
// }
