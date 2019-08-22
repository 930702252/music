package com.lanqiao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanqiao.model.Music;
import com.lanqiao.model.Singer;
import com.lanqiao.service.AlbumServiceImpl;
import com.lanqiao.service.IAlbumService;
import com.lanqiao.service.IMusicService;
import com.lanqiao.service.IMvService;
import com.lanqiao.service.ISingerService;
import com.lanqiao.service.SingerServiceImpl;

@RestController
public class SingerController {
//	调用歌手的service
	@Autowired
	private ISingerService service1;
	@Autowired
	private IAlbumService service2;
	@Autowired
	private IMusicService service3;
	@Autowired
	private IMvService service4;
//	查询所有歌手
	@GetMapping("/singer")
	public List<Singer> loadSinger(){
		return service1.selectAll();
	}
//	根据首字母查询歌手
	@PostMapping("/singerf")
	public List<Singer> selectAllByFw(String fw){
		System.out.println(fw);
		return service1.selectAllByFw(fw);
	}
//	根据类型查询歌手
	@PostMapping("/singert")
	public List<Singer> selectByType(String type){
		System.out.println(type);
		return service1.selectByType(type);
	}
//// 	根据歌手查询歌手的专辑数量
//	public int selectAlubumCountBySid(Integer sid){
//		return service2.selectCountBySid(sid);
//	}
//// 	根据歌手查询歌手的单曲数量
//	public int selectMusicCountBySid(Integer sid){
//		return service3.selectMusicCountBysid(sid);
//	}
	@PostMapping("/singerd")
	public Map selectMore(Integer sid){
		System.out.println(sid+   "  sid");
		Singer singer = service1.selectByPrimaryKey(sid);
		
//		List<Music> list = service3.selectMusicBysid(sid);
		
		int albumCount=service2.selectCountBySid(sid);//专辑总数
		
		
		int musicCount=service3.selectMusicCountBysid(sid);//单曲总数
		
		int mvCount=service4.selectMvCountBysid(sid);//mv数量
		Map map=new HashMap<>();
		map.put("singer", singer);
//		map.put("list", list);
		map.put("albumCount", albumCount);
		map.put("musicCount", musicCount);
		map.put("mvCount", mvCount);
//		System.out.println("map  " + map);
//		System.out.println(list);
		return map;
	}
	@PostMapping("/musicm")
	public List selectMusicm(Integer sid){
		
//		List<Music> list = service3.selectMusicBysid(sid);
//		System.out.println(list);
		return service3.selectMusicBysid(sid);
		
	}
}
