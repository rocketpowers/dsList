package Packages.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	@Column(name="game_year")
	private Integer year;
	
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescripton;

	public Game() {

	}

	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
			String shortDescription, String longDescripton) {

		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescripton = longDescripton;
	}

}
