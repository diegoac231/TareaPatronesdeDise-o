
package com.mycompany.patrondiseno1;

import java.util.List;

public interface Heroe {
    String getName();
    void setName(String name);
    String getAppearance();
    void setAppearance(String appearance);
    int getExperience();
    void setExperience(int experience);
    int getLevel();
    void setLevel(int level);
    int getSkillPoints();
    void setSkillPoints(int skillPoints);
    List<Skill> getSkills();
    void addSkill(Skill skill);
    void removeSkill(Skill skill);
}
