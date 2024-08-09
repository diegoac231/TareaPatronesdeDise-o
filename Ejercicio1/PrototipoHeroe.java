
package com.mycompany.patrondiseno1;

import java.util.List;


    public abstract class PrototipoHeroe implements Heroe, Cloneable {
    private String name;
    private String appearance;
    private int experience;
    private int level;
    private int skillPoints;
    private List<Skill> skills;

    public PrototipoHeroe(String name, String appearance, int experience, int level, int skillPoints, List<Skill> skills) {
        this.name = name;
        this.appearance = appearance;
        this.experience = experience;
        this.level = level;
        this.skillPoints = skillPoints;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAppearance() {
        return appearance;
    }


    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    
    public int getExperience() {
        return experience;
    }

    
    public void setExperience(int experience) {
        this.experience = experience;
    }

    
    public int getLevel() {
        return level;
    }

    
    public void setLevel(int level) {
        this.level = level;
    }

    
    public int getSkillPoints() {
        return skillPoints;
    }

    
    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    
    public List<Skill> getSkills() {
        return skills;
    }

    
    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    
    public void removeSkill(Skill skill) {
        skills.remove(skill);
    }
    @Override
    public PrototipoHeroe clone() {
        try {
            return (PrototipoHeroe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}


