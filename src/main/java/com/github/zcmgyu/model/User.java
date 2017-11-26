package com.github.zcmgyu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//@Entity
//@Table(name="\"user\"")
//public class User {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//
//	@NotEmpty
//	private String name;
//
//	@NotEmpty
//	@Column(unique = true, nullable = false)
//	private String login;
//
//	@NotEmpty
//	private String password;
//
//	@JsonIgnore
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
//	private Set<Role> roles = new HashSet<Role>();
//
//	public User() {
//	}
//
//	public User(User user) {
//		super();
//		this.id = user.getId();
//		this.name = user.getName();
//		this.login = user.getLogin();
//		this.password = user.getPassword();
//		this.roles = user.getRoles();
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}
//
//}

@Document(collection = "User")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private List<Role> roles;

    public User(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

