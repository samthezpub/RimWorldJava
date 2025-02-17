package entity;

import builder.CharacterBuilder;
import enums.CharacterTraits;

public class Character {
    private String name;
    private int age;
    private CharacterTraits[] traits;

    public Character(CharacterBuilder characterBuilder) {
        this.name = characterBuilder.getName();
        this.age = characterBuilder.getAge();
        this.traits = characterBuilder.getTraits();
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


}
