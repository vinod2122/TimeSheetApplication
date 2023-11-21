package com.vinod.TimeSheetApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="user_roles",
    joinColumns = {@JoinColumn(name="USER_ID",referencedColumnName = "ID")},
    inverseJoinColumns = {@JoinColumn(name="ROLE_ID",referencedColumnName = "ID")})
    private List<Role> roles=new ArrayList<>();
   /* public void setRoles(Set<Role> roles)
    {
        this.roles=roles;
    }
    public Set<Role> getRoles()
    {
        return roles;
    }
    public void addRole(Role role){
        this.roles.add(role);
    }
*/
}