package entity;

import builder.CharacterBuilder;
import enums.CharacterTraits;
import interfaces.CharacterState;

public class CharacterContext {
    private String name;
    private int age;
    private CharacterTraits[] traits;
    private CharacterState state;

    public CharacterContext(CharacterBuilder characterBuilder) {
        this.name = characterBuilder.getName();
        this.age = characterBuilder.getAge();
        this.traits = characterBuilder.getTraits();
        this.state = characterBuilder.getState();
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
    public CharacterState getState() {
        return state;
    }
    public void setState(CharacterState state) {
        this.state = state;
    }
}
