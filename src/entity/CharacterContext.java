package entity;

import builder.CharacterBuilder;
import enums.CharacterTraits;
import interfaces.CharacterState;

import java.util.Arrays;

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

    @Override
    public boolean equals(Object o){
        if (this == o) return false;
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        CharacterContext character = (CharacterContext) o;
        if (character.name.equals(character.name)
                && this.age == character.age
                && this.traits.equals(character.traits)
                && this.state.equals(character.state))
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        int result = 31;
        result = result + 31 * name.hashCode();
        result = result + 31 * age;
        result = result + 31 * Arrays.hashCode(traits);
        result = result + 31 * state.hashCode();

        return result;
    }
}
