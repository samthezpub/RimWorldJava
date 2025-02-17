package builder;

import entity.CharacterContext;
import enums.CharacterTraits;
import interfaces.CharacterState;

public class CharacterBuilder {
    private String name;
    private int age;
    private CharacterTraits[] traits;
    private CharacterState state;

    public CharacterBuilder(String name, int age, CharacterTraits[] traits, CharacterState state) {
        this.name = name;
        this.age = age;
        this.traits = traits;
        this.state = state;
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

    public CharacterContext build(){
        return new CharacterContext(this);
    }
}
