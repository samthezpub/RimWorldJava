package builder;

import entity.Character;
import enums.CharacterTraits;

public class CharacterBuilder {
    private String name;
    private int age;
    private CharacterTraits[] traits;

    public CharacterBuilder(String name, int age, CharacterTraits[] traits) {
        this.name = name;
        this.age = age;
        this.traits = traits;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public CharacterTraits[] getTraits() {
        return traits;
    }
    public void setTraits(CharacterTraits[] traits) {
        this.traits = traits;
    }

    public Character build(){
        return new Character(this);
    }
}
