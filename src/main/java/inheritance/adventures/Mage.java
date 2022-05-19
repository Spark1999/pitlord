package inheritance.adventures;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Hero {
    Integer mana;
    ArrayList<String> manaRegenItems;

    public Mage() {
        super();
        this.manaRegenItems = new ArrayList(Arrays.asList("basilius", "null talisman", "magic wand"));
    }

    public Mage(String name, Integer strength, Integer agility, Integer intelligence, Integer mana) {
        super(name, strength, agility, intelligence);
        this.mana = mana;
        this.manaRegenItems = new ArrayList(Arrays.asList("basilius", "null talisman", "magic wand"));
    }

    public void addArtefact(String newArtefact){
        this.manaRegenItems.add(newArtefact);
    }

    public void updateArtefact(int position, String newArtefact){
        this.manaRegenItems.set(position, newArtefact);
    }

    public void deleteArtefact (int position){
        this.manaRegenItems.remove(position);
    }

    public Integer getMana() {
        return this.mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public ArrayList<String> getManaRegenItems() {
        return this.manaRegenItems;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intellegence=" + intellegence +
                ", mana=" + mana +
                ", manaRegenItems=" + manaRegenItems +
                '}';
    }
}
