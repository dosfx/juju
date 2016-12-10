package ca.dosfx.juju.item;

/**
 * Created by Dos on 2016-12-04.
 */
public class ItemNames
{
    private static final String AxePostfix = "_axe";
    private static final String GemPostfix = "_gem";
    private static final String HoePostfix = "_hoe";
    private static final String PickaxePostfix = "_pickaxe";
    private static final String SpadePostfix = "_spade";
    private static final String SwordPostfix = "_sword";

    public static String getAxeName(String name)
    {
        return getName(name, AxePostfix);
    }

    public static String getGemName(String name)
    {
        return getName(name, GemPostfix);
    }

    public static String getHoeName(String name)
    {
        return getName(name, HoePostfix);
    }

    public static String getPickaxeName(String name)
    {
        return getName(name, PickaxePostfix);
    }

    public static String getSpadeName(String name)
    {
        return getName(name, SpadePostfix);
    }

    public static String getSwordName(String name)
    {
        return getName(name, SwordPostfix);
    }

    private static String getName(String name, String postfix)
    {
        return name.toLowerCase() + postfix;
    }
}
