
class BetterString {
public static void main(String args[]) {

String string1 = "Shereen";
String string2 = "Sherin";

String longer = Stringutils.betterString(string1,string2,(s1,s2) ->s1.length()>s2.length());

