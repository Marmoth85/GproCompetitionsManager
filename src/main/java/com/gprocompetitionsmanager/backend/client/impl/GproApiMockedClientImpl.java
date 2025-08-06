package com.gprocompetitionsmanager.backend.client.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gprocompetitionsmanager.backend.client.GproApiClient;
import com.gprocompetitionsmanager.backend.model.dto.Race;
import com.gprocompetitionsmanager.backend.model.dto.StartingGrid;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
@ConditionalOnProperty(value="gpro.api.isMocked", havingValue = "true", matchIfMissing = true)
public class GproApiMockedClientImpl implements GproApiClient {

    private final ObjectMapper objectMapper;

    public Mono<Race> getRaceData(Long season, Long gp, String group) throws JsonProcessingException {

        String mockedResponse = "{\n" +
                "    \"loadingDataState\": \"1\",\n" +
                "    \"segmentSelected\": \"group\",\n" +
                "    \"loadingData\": 0,\n" +
                "    \"group\": \"Elite\",\n" +
                "    \"class\": \"\",\n" +
                "    \"nation\": \"fr\",\n" +
                "    \"team\": 1261,\n" +
                "    \"season\": \"106\",\n" +
                "    \"race\": \"1\",\n" +
                "    \"trackName\": \"Hungaroring\",\n" +
                "    \"trackId\": \"9\",\n" +
                "    \"managers\": [\n" +
                "        {\n" +
                "            \"name\": \"Joaqu&#237;n Quintana\",\n" +
                "            \"idx\": \"1\",\n" +
                "            \"pos\": \"1\",\n" +
                "            \"progress\": 0,\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 22881,\n" +
                "            \"raceTime\": \"1h37:58.822\",\n" +
                "            \"lapsCompleted\": \"77\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:13.982s\",\n" +
                "            \"bestLapTimeRaw\": 73982,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"187.08\",\n" +
                "            \"bestPitTime\": \"14.567s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Paulo Pinto\",\n" +
                "            \"idx\": \"2\",\n" +
                "            \"pos\": \"2\",\n" +
                "            \"progress\": 0,\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"pt\",\n" +
                "            \"IDM\": 155479,\n" +
                "            \"raceTime\": \"+ 22.910\",\n" +
                "            \"lapsCompleted\": \"77\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.269s\",\n" +
                "            \"bestLapTimeRaw\": 74269,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"186.35\",\n" +
                "            \"bestPitTime\": \"12.930s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"1\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kristijan Mihovic\",\n" +
                "            \"idx\": \"3\",\n" +
                "            \"pos\": \"3\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hr\",\n" +
                "            \"IDM\": 671001,\n" +
                "            \"raceTime\": \"+ 42.505\",\n" +
                "            \"lapsCompleted\": \"77\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.440s\",\n" +
                "            \"bestLapTimeRaw\": 74440,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"185.74\",\n" +
                "            \"bestPitTime\": \"14.135s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pablo Fernandez\",\n" +
                "            \"idx\": \"4\",\n" +
                "            \"pos\": \"4\",\n" +
                "            \"progress\": 3,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 773224,\n" +
                "            \"raceTime\": \"+ 46.696\",\n" +
                "            \"lapsCompleted\": \"77\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:13.491s\",\n" +
                "            \"bestLapTimeRaw\": 73491,\n" +
                "            \"bestLapColor\": \"lime\",\n" +
                "            \"avgSpeed\": \"185.60\",\n" +
                "            \"bestPitTime\": \"12.311s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"3\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andrea Squizzato\",\n" +
                "            \"idx\": \"5\",\n" +
                "            \"pos\": \"5\",\n" +
                "            \"progress\": -2,\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 11391,\n" +
                "            \"raceTime\": \"+ 48.787\",\n" +
                "            \"lapsCompleted\": \"77\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.777s\",\n" +
                "            \"bestLapTimeRaw\": 74777,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"185.54\",\n" +
                "            \"bestPitTime\": \"14.274s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"1\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jean-marc Boissinot\",\n" +
                "            \"idx\": \"6\",\n" +
                "            \"pos\": \"6\",\n" +
                "            \"progress\": 0,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 717393,\n" +
                "            \"raceTime\": \"+ 1:19.033\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.952s\",\n" +
                "            \"bestLapTimeRaw\": 74952,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"184.60\",\n" +
                "            \"bestPitTime\": \"15.562s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gerg&#337; Csern&#225;toni\",\n" +
                "            \"idx\": \"7\",\n" +
                "            \"pos\": \"7\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 583077,\n" +
                "            \"raceTime\": \"+ 1:19.487\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.876s\",\n" +
                "            \"bestLapTimeRaw\": 74876,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"184.58\",\n" +
                "            \"bestPitTime\": \"13.038s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brice Meyer\",\n" +
                "            \"idx\": \"8\",\n" +
                "            \"pos\": \"8\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 699900,\n" +
                "            \"raceTime\": \"+ 1:42.103\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.508s\",\n" +
                "            \"bestLapTimeRaw\": 75508,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"183.88\",\n" +
                "            \"bestPitTime\": \"14.347s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Harsh Sheth\",\n" +
                "            \"idx\": \"9\",\n" +
                "            \"pos\": \"9\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"in\",\n" +
                "            \"IDM\": 325798,\n" +
                "            \"raceTime\": \"+ 1:42.270\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.094s\",\n" +
                "            \"bestLapTimeRaw\": 75094,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"183.88\",\n" +
                "            \"bestPitTime\": \"14.348s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lorenzo Di Buono\",\n" +
                "            \"idx\": \"10\",\n" +
                "            \"pos\": \"10\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 690952,\n" +
                "            \"raceTime\": \"+ 1:56.846\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.542s\",\n" +
                "            \"bestLapTimeRaw\": 75542,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"183.43\",\n" +
                "            \"bestPitTime\": \"14.502s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"1\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antonio Gattulli\",\n" +
                "            \"idx\": \"11\",\n" +
                "            \"pos\": \"11\",\n" +
                "            \"progress\": -6,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 370032,\n" +
                "            \"raceTime\": \"+ 2:04.519\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"3\",\n" +
                "            \"bestLapTime\": \"1:15.570s\",\n" +
                "            \"bestLapTimeRaw\": 75570,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"183.20\",\n" +
                "            \"bestPitTime\": \"13.026s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gy&#246;rgy Sz&#233;kely\",\n" +
                "            \"idx\": \"12\",\n" +
                "            \"pos\": \"12\",\n" +
                "            \"progress\": 2,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 692890,\n" +
                "            \"raceTime\": \"+ 2:14.794\",\n" +
                "            \"lapsCompleted\": \"76\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:14.619s\",\n" +
                "            \"bestLapTimeRaw\": 74619,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"182.88\",\n" +
                "            \"bestPitTime\": \"14.610s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Fabio Zambetta\",\n" +
                "            \"idx\": \"13\",\n" +
                "            \"pos\": \"13\",\n" +
                "            \"progress\": 3,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 299911,\n" +
                "            \"raceTime\": \"+ 2:44.927\",\n" +
                "            \"lapsCompleted\": \"75\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:16.370s\",\n" +
                "            \"bestLapTimeRaw\": 76370,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"181.97\",\n" +
                "            \"bestPitTime\": \"22.254s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Apostolis Goutzos\",\n" +
                "            \"idx\": \"14\",\n" +
                "            \"pos\": \"14\",\n" +
                "            \"progress\": 3,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"gr\",\n" +
                "            \"IDM\": 171261,\n" +
                "            \"raceTime\": \"+ 2:44.971\",\n" +
                "            \"lapsCompleted\": \"75\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.886s\",\n" +
                "            \"bestLapTimeRaw\": 75886,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"181.97\",\n" +
                "            \"bestPitTime\": \"13.522s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Branislav Mihi&#263;\",\n" +
                "            \"idx\": \"15\",\n" +
                "            \"pos\": \"15\",\n" +
                "            \"progress\": -3,\n" +
                "            \"tyre\": \"Bridgerock\",\n" +
                "            \"natCode\": \"dk\",\n" +
                "            \"IDM\": 848438,\n" +
                "            \"raceTime\": \"+ 2:45.264\",\n" +
                "            \"lapsCompleted\": \"75\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.373s\",\n" +
                "            \"bestLapTimeRaw\": 75373,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"181.96\",\n" +
                "            \"bestPitTime\": \"17.646s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"1\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominik Krowiak\",\n" +
                "            \"idx\": \"16\",\n" +
                "            \"pos\": \"16\",\n" +
                "            \"progress\": -1,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 12314,\n" +
                "            \"raceTime\": \"+ 3:27.744\",\n" +
                "            \"lapsCompleted\": \"75\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.690s\",\n" +
                "            \"bestLapTimeRaw\": 75690,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"180.69\",\n" +
                "            \"bestPitTime\": \"19.280s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Maz West\",\n" +
                "            \"idx\": \"17\",\n" +
                "            \"pos\": \"17\",\n" +
                "            \"progress\": 7,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 251550,\n" +
                "            \"raceTime\": \"+ 3:30.874\",\n" +
                "            \"lapsCompleted\": \"75\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:15.659s\",\n" +
                "            \"bestLapTimeRaw\": 75659,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"180.60\",\n" +
                "            \"bestPitTime\": \"18.122s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Petr Val&#237;&#269;ek\",\n" +
                "            \"idx\": \"18\",\n" +
                "            \"pos\": \"18\",\n" +
                "            \"progress\": 2,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"cz\",\n" +
                "            \"IDM\": 270058,\n" +
                "            \"raceTime\": \"+ 3:42.904\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:16.787s\",\n" +
                "            \"bestLapTimeRaw\": 76787,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"180.24\",\n" +
                "            \"bestPitTime\": \"15.323s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominiek Van West\",\n" +
                "            \"idx\": \"19\",\n" +
                "            \"pos\": \"19\",\n" +
                "            \"progress\": 9,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 1967,\n" +
                "            \"raceTime\": \"+ 3:55.817\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:16.163s\",\n" +
                "            \"bestLapTimeRaw\": 76163,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.86\",\n" +
                "            \"bestPitTime\": \"18.871s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"1\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud Ferraris\",\n" +
                "            \"idx\": \"20\",\n" +
                "            \"pos\": \"20\",\n" +
                "            \"progress\": 7,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 147060,\n" +
                "            \"raceTime\": \"+ 3:56.988\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:16.641s\",\n" +
                "            \"bestLapTimeRaw\": 76641,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.83\",\n" +
                "            \"bestPitTime\": \"16.343s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sergio Fanelli\",\n" +
                "            \"idx\": \"21\",\n" +
                "            \"pos\": \"21\",\n" +
                "            \"progress\": 4,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 162844,\n" +
                "            \"raceTime\": \"+ 4:01.016\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:16.999s\",\n" +
                "            \"bestLapTimeRaw\": 76999,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.71\",\n" +
                "            \"bestPitTime\": \"22.321s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Craig Templeman\",\n" +
                "            \"idx\": \"22\",\n" +
                "            \"pos\": \"22\",\n" +
                "            \"progress\": 14,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"en\",\n" +
                "            \"IDM\": 6991,\n" +
                "            \"raceTime\": \"+ 4:02.233\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:17.030s\",\n" +
                "            \"bestLapTimeRaw\": 77030,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.67\",\n" +
                "            \"bestPitTime\": \"21.092s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bart&#322;omiej Nowak\",\n" +
                "            \"idx\": \"23\",\n" +
                "            \"pos\": \"23\",\n" +
                "            \"progress\": 6,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 175865,\n" +
                "            \"raceTime\": \"+ 4:18.200\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:16.815s\",\n" +
                "            \"bestLapTimeRaw\": 76815,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.21\",\n" +
                "            \"bestPitTime\": \"19.704s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Peter Both\",\n" +
                "            \"idx\": \"24\",\n" +
                "            \"pos\": \"24\",\n" +
                "            \"progress\": -1,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 785482,\n" +
                "            \"raceTime\": \"+ 4:23.462\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:16.881s\",\n" +
                "            \"bestLapTimeRaw\": 76881,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"179.05\",\n" +
                "            \"bestPitTime\": \"14.579s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Toni S&#246;yrinki\",\n" +
                "            \"idx\": \"25\",\n" +
                "            \"pos\": \"25\",\n" +
                "            \"progress\": 5,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fi\",\n" +
                "            \"IDM\": 20271,\n" +
                "            \"raceTime\": \"+ 4:28.312\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:17.807s\",\n" +
                "            \"bestLapTimeRaw\": 77807,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"178.91\",\n" +
                "            \"bestPitTime\": \"21.578s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Justinas Bublys\",\n" +
                "            \"idx\": \"26\",\n" +
                "            \"pos\": \"26\",\n" +
                "            \"progress\": -5,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"lt\",\n" +
                "            \"IDM\": 938214,\n" +
                "            \"raceTime\": \"+ 4:35.801\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:17.194s\",\n" +
                "            \"bestLapTimeRaw\": 77194,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"178.69\",\n" +
                "            \"bestPitTime\": \"18.568s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andr&#225;s Boz&#243;ti\",\n" +
                "            \"idx\": \"27\",\n" +
                "            \"pos\": \"27\",\n" +
                "            \"progress\": -14,\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 199945,\n" +
                "            \"raceTime\": \"+ 4:44.379\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:15.598s\",\n" +
                "            \"bestLapTimeRaw\": 75598,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"178.45\",\n" +
                "            \"bestPitTime\": \"23.245s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Erik Harken\",\n" +
                "            \"idx\": \"28\",\n" +
                "            \"pos\": \"28\",\n" +
                "            \"progress\": -10,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"us\",\n" +
                "            \"IDM\": 428277,\n" +
                "            \"raceTime\": \"+ 4:50.311\",\n" +
                "            \"lapsCompleted\": \"74\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:18.013s\",\n" +
                "            \"bestLapTimeRaw\": 78013,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"178.27\",\n" +
                "            \"bestPitTime\": \"20.890s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mihaly Horvath\",\n" +
                "            \"idx\": \"29\",\n" +
                "            \"pos\": \"29\",\n" +
                "            \"progress\": 6,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"ro\",\n" +
                "            \"IDM\": 910684,\n" +
                "            \"raceTime\": \"+ 5:01.539\",\n" +
                "            \"lapsCompleted\": \"73\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:17.609s\",\n" +
                "            \"bestLapTimeRaw\": 77609,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"177.95\",\n" +
                "            \"bestPitTime\": \"18.262s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pedro Moura\",\n" +
                "            \"idx\": \"30\",\n" +
                "            \"pos\": \"30\",\n" +
                "            \"progress\": 1,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 205978,\n" +
                "            \"raceTime\": \"+ 5:44.153\",\n" +
                "            \"lapsCompleted\": \"73\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:18.678s\",\n" +
                "            \"bestLapTimeRaw\": 78678,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"176.73\",\n" +
                "            \"bestPitTime\": \"18.721s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Juan Diego Mil&#225;n\",\n" +
                "            \"idx\": \"31\",\n" +
                "            \"pos\": \"31\",\n" +
                "            \"progress\": -12,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"uy\",\n" +
                "            \"IDM\": 190722,\n" +
                "            \"raceTime\": \"+ 6:06.670\",\n" +
                "            \"lapsCompleted\": \"73\",\n" +
                "            \"pitStops\": \"3\",\n" +
                "            \"bestLapTime\": \"1:18.375s\",\n" +
                "            \"bestLapTimeRaw\": 78375,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"176.10\",\n" +
                "            \"bestPitTime\": \"14.817s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud de Marneffe\",\n" +
                "            \"idx\": \"32\",\n" +
                "            \"pos\": \"32\",\n" +
                "            \"progress\": 2,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 165277,\n" +
                "            \"raceTime\": \"+ 6:26.270\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:19.140s\",\n" +
                "            \"bestLapTimeRaw\": 79140,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"175.54\",\n" +
                "            \"bestPitTime\": \"24.680s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ma&#235;l Pallot\",\n" +
                "            \"idx\": \"33\",\n" +
                "            \"pos\": \"33\",\n" +
                "            \"progress\": 4,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 829411,\n" +
                "            \"raceTime\": \"+ 6:48.244\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:19.484s\",\n" +
                "            \"bestLapTimeRaw\": 79484,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.93\",\n" +
                "            \"bestPitTime\": \"19.167s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Diogo Schwinn\",\n" +
                "            \"idx\": \"34\",\n" +
                "            \"pos\": \"34\",\n" +
                "            \"progress\": 4,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 664352,\n" +
                "            \"raceTime\": \"+ 6:49.073\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:19.021s\",\n" +
                "            \"bestLapTimeRaw\": 79021,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.91\",\n" +
                "            \"bestPitTime\": \"23.804s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mateusz Zaborny\",\n" +
                "            \"idx\": \"35\",\n" +
                "            \"pos\": \"35\",\n" +
                "            \"progress\": 5,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 24153,\n" +
                "            \"raceTime\": \"+ 6:59.031\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:19.618s\",\n" +
                "            \"bestLapTimeRaw\": 79618,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.63\",\n" +
                "            \"bestPitTime\": \"22.036s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Martti Kaasik\",\n" +
                "            \"idx\": \"36\",\n" +
                "            \"pos\": \"36\",\n" +
                "            \"progress\": -10,\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"ee\",\n" +
                "            \"IDM\": 349054,\n" +
                "            \"raceTime\": \"+ 7:01.937\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"3\",\n" +
                "            \"bestLapTime\": \"1:19.470s\",\n" +
                "            \"bestLapTimeRaw\": 79470,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.55\",\n" +
                "            \"bestPitTime\": \"16.028s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mark Webster\",\n" +
                "            \"idx\": \"37\",\n" +
                "            \"pos\": \"37\",\n" +
                "            \"progress\": -4,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"ca\",\n" +
                "            \"IDM\": 5861,\n" +
                "            \"raceTime\": \"+ 7:08.956\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"2\",\n" +
                "            \"bestLapTime\": \"1:19.606s\",\n" +
                "            \"bestLapTimeRaw\": 79606,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.36\",\n" +
                "            \"bestPitTime\": \"11.707s\",\n" +
                "            \"bestPitColor\": \"lime\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Patryk Janczak\",\n" +
                "            \"idx\": \"38\",\n" +
                "            \"pos\": \"38\",\n" +
                "            \"progress\": -6,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 143401,\n" +
                "            \"raceTime\": \"+ 7:12.397\",\n" +
                "            \"lapsCompleted\": \"72\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:19.691s\",\n" +
                "            \"bestLapTimeRaw\": 79691,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"174.26\",\n" +
                "            \"bestPitTime\": \"21.550s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kuba Szajbel\",\n" +
                "            \"idx\": \"39\",\n" +
                "            \"pos\": \"39\",\n" +
                "            \"progress\": 0,\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 231989,\n" +
                "            \"raceTime\": \"+ 7:34.267\",\n" +
                "            \"lapsCompleted\": \"71\",\n" +
                "            \"pitStops\": \"1\",\n" +
                "            \"bestLapTime\": \"1:20.124s\",\n" +
                "            \"bestLapTimeRaw\": 80124,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"173.66\",\n" +
                "            \"bestPitTime\": \"18.660s\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 1,\n" +
                "            \"firstNotClassified\": 0\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Viktor Dyankov\",\n" +
                "            \"idx\": \"40\",\n" +
                "            \"pos\": \"40\",\n" +
                "            \"progress\": -18,\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"bg\",\n" +
                "            \"IDM\": 202255,\n" +
                "            \"raceTime\": \"Tyre puncture\",\n" +
                "            \"lapsCompleted\": \"16\",\n" +
                "            \"pitStops\": \"0\",\n" +
                "            \"bestLapTime\": \"1:19.060s\",\n" +
                "            \"bestLapTimeRaw\": 79060,\n" +
                "            \"bestLapColor\": \"\",\n" +
                "            \"avgSpeed\": \"-\",\n" +
                "            \"bestPitTime\": \"-\",\n" +
                "            \"bestPitColor\": \"\",\n" +
                "            \"champs\": \"0\",\n" +
                "            \"classified\": 0,\n" +
                "            \"firstNotClassified\": 1\n" +
                "        }\n" +
                "    ]," +
                "    \"cutoffTime112percent\": \"11:45.459\",\n" +
                "    \"apiRequestsRemaining\": 99" +
                "}";

        Race race = objectMapper.readValue(mockedResponse, Race.class);
        return Mono.just(race);
    }

    public Mono<StartingGrid> getQualifData(Long season, Long gp, String group) throws JsonProcessingException {
        String startingGridResults = "{\n" +
                "    \"loadingDataState\": \"1\",\n" +
                "    \"group\": \"Elite\",\n" +
                "    \"trackName\": \"Hungaroring\",\n" +
                "    \"trackId\": \"9\",\n" +
                "    \"season\": \"106\",\n" +
                "    \"race\": \"1\",\n" +
                "    \"q1Data\": [\n" +
                "        {\n" +
                "            \"name\": \"Joaqu&#237;n Quintana\",\n" +
                "            \"pos\": \"1\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 22881,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:13.553\",\n" +
                "            \"gap\": \"+0.000\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Paulo Pinto\",\n" +
                "            \"pos\": \"2\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"pt\",\n" +
                "            \"IDM\": 155479,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:14.155\",\n" +
                "            \"gap\": \"+0.602\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jean-marc Boissinot\",\n" +
                "            \"pos\": \"3\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 717393,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:14.760\",\n" +
                "            \"gap\": \"+1.207\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antonio Gattulli\",\n" +
                "            \"pos\": \"4\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 370032,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:14.959\",\n" +
                "            \"gap\": \"+1.406\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kristijan Mihovic\",\n" +
                "            \"pos\": \"5\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hr\",\n" +
                "            \"IDM\": 671001,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.074\",\n" +
                "            \"gap\": \"+1.521\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andrea Squizzato\",\n" +
                "            \"pos\": \"6\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 11391,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:15.200\",\n" +
                "            \"gap\": \"+1.647\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pablo Fernandez\",\n" +
                "            \"pos\": \"7\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 773224,\n" +
                "            \"champs\": \"3\",\n" +
                "            \"lapTime\": \"1:15.308\",\n" +
                "            \"gap\": \"+1.755\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gerg&#337; Csern&#225;toni\",\n" +
                "            \"pos\": \"8\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 583077,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.458\",\n" +
                "            \"gap\": \"+1.905\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Branislav Mihi&#263;\",\n" +
                "            \"pos\": \"9\",\n" +
                "            \"tyre\": \"Bridgerock\",\n" +
                "            \"natCode\": \"dk\",\n" +
                "            \"IDM\": 848438,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:15.632\",\n" +
                "            \"gap\": \"+2.079\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brice Meyer\",\n" +
                "            \"pos\": \"10\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 699900,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.696\",\n" +
                "            \"gap\": \"+2.143\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lorenzo Di Buono\",\n" +
                "            \"pos\": \"11\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 690952,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:16.065\",\n" +
                "            \"gap\": \"+2.512\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominik Krowiak\",\n" +
                "            \"pos\": \"12\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 12314,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.137\",\n" +
                "            \"gap\": \"+2.584\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andr&#225;s Boz&#243;ti\",\n" +
                "            \"pos\": \"13\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 199945,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.142\",\n" +
                "            \"gap\": \"+2.589\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Fabio Zambetta\",\n" +
                "            \"pos\": \"14\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 299911,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.242\",\n" +
                "            \"gap\": \"+2.689\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Harsh Sheth\",\n" +
                "            \"pos\": \"15\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"in\",\n" +
                "            \"IDM\": 325798,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.264\",\n" +
                "            \"gap\": \"+2.711\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gy&#246;rgy Sz&#233;kely\",\n" +
                "            \"pos\": \"16\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 692890,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.310\",\n" +
                "            \"gap\": \"+2.757\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Maz West\",\n" +
                "            \"pos\": \"17\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 251550,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.474\",\n" +
                "            \"gap\": \"+2.921\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Apostolis Goutzos\",\n" +
                "            \"pos\": \"18\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"gr\",\n" +
                "            \"IDM\": 171261,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.490\",\n" +
                "            \"gap\": \"+2.937\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Petr Val&#237;&#269;ek\",\n" +
                "            \"pos\": \"19\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"cz\",\n" +
                "            \"IDM\": 270058,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.509\",\n" +
                "            \"gap\": \"+2.956\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Justinas Bublys\",\n" +
                "            \"pos\": \"20\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"lt\",\n" +
                "            \"IDM\": 938214,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.519\",\n" +
                "            \"gap\": \"+2.966\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Juan Diego Mil&#225;n\",\n" +
                "            \"pos\": \"21\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"uy\",\n" +
                "            \"IDM\": 190722,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.566\",\n" +
                "            \"gap\": \"+3.013\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Viktor Dyankov\",\n" +
                "            \"pos\": \"22\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"bg\",\n" +
                "            \"IDM\": 202255,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.730\",\n" +
                "            \"gap\": \"+3.177\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud Ferraris\",\n" +
                "            \"pos\": \"23\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 147060,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.751\",\n" +
                "            \"gap\": \"+3.198\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Erik Harken\",\n" +
                "            \"pos\": \"24\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"us\",\n" +
                "            \"IDM\": 428277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.820\",\n" +
                "            \"gap\": \"+3.267\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Toni S&#246;yrinki\",\n" +
                "            \"pos\": \"25\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fi\",\n" +
                "            \"IDM\": 20271,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.865\",\n" +
                "            \"gap\": \"+3.312\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Peter Both\",\n" +
                "            \"pos\": \"26\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 785482,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.877\",\n" +
                "            \"gap\": \"+3.324\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sergio Fanelli\",\n" +
                "            \"pos\": \"27\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 162844,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.893\",\n" +
                "            \"gap\": \"+3.340\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominiek Van West\",\n" +
                "            \"pos\": \"28\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 1967,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:16.950\",\n" +
                "            \"gap\": \"+3.397\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Patryk Janczak\",\n" +
                "            \"pos\": \"29\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 143401,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.962\",\n" +
                "            \"gap\": \"+3.409\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pedro Moura\",\n" +
                "            \"pos\": \"30\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 205978,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.002\",\n" +
                "            \"gap\": \"+3.449\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bart&#322;omiej Nowak\",\n" +
                "            \"pos\": \"31\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 175865,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.189\",\n" +
                "            \"gap\": \"+3.636\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mihaly Horvath\",\n" +
                "            \"pos\": \"32\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"ro\",\n" +
                "            \"IDM\": 910684,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.534\",\n" +
                "            \"gap\": \"+3.981\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Diogo Schwinn\",\n" +
                "            \"pos\": \"33\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 664352,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.616\",\n" +
                "            \"gap\": \"+4.063\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Martti Kaasik\",\n" +
                "            \"pos\": \"34\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"ee\",\n" +
                "            \"IDM\": 349054,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.623\",\n" +
                "            \"gap\": \"+4.070\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mark Webster\",\n" +
                "            \"pos\": \"35\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"ca\",\n" +
                "            \"IDM\": 5861,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.670\",\n" +
                "            \"gap\": \"+4.117\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud de Marneffe\",\n" +
                "            \"pos\": \"36\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 165277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.869\",\n" +
                "            \"gap\": \"+4.316\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Craig Templeman\",\n" +
                "            \"pos\": \"37\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"en\",\n" +
                "            \"IDM\": 6991,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.938\",\n" +
                "            \"gap\": \"+4.385\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ma&#235;l Pallot\",\n" +
                "            \"pos\": \"38\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 829411,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.040\",\n" +
                "            \"gap\": \"+4.487\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mateusz Zaborny\",\n" +
                "            \"pos\": \"39\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 24153,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.196\",\n" +
                "            \"gap\": \"+4.643\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kuba Szajbel\",\n" +
                "            \"pos\": \"40\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 231989,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.387\",\n" +
                "            \"gap\": \"+4.834\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"q2Data\": [\n" +
                "        {\n" +
                "            \"name\": \"Joaqu&#237;n Quintana\",\n" +
                "            \"pos\": \"1\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 22881,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:14.140\",\n" +
                "            \"gap\": \"+0.000\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Paulo Pinto\",\n" +
                "            \"pos\": \"2\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"pt\",\n" +
                "            \"IDM\": 155479,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:14.828\",\n" +
                "            \"gap\": \"+0.688\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andrea Squizzato\",\n" +
                "            \"pos\": \"3\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 11391,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:14.933\",\n" +
                "            \"gap\": \"+0.793\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kristijan Mihovic\",\n" +
                "            \"pos\": \"4\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hr\",\n" +
                "            \"IDM\": 671001,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.286\",\n" +
                "            \"gap\": \"+1.146\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antonio Gattulli\",\n" +
                "            \"pos\": \"5\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 370032,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.489\",\n" +
                "            \"gap\": \"+1.349\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jean-marc Boissinot\",\n" +
                "            \"pos\": \"6\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 717393,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:15.705\",\n" +
                "            \"gap\": \"+1.565\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pablo Fernandez\",\n" +
                "            \"pos\": \"7\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 773224,\n" +
                "            \"champs\": \"3\",\n" +
                "            \"lapTime\": \"1:15.741\",\n" +
                "            \"gap\": \"+1.601\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gerg&#337; Csern&#225;toni\",\n" +
                "            \"pos\": \"8\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 583077,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.263\",\n" +
                "            \"gap\": \"+2.123\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Harsh Sheth\",\n" +
                "            \"pos\": \"9\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"in\",\n" +
                "            \"IDM\": 325798,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.328\",\n" +
                "            \"gap\": \"+2.188\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lorenzo Di Buono\",\n" +
                "            \"pos\": \"10\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 690952,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:16.644\",\n" +
                "            \"gap\": \"+2.504\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brice Meyer\",\n" +
                "            \"pos\": \"11\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 699900,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.751\",\n" +
                "            \"gap\": \"+2.611\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gy&#246;rgy Sz&#233;kely\",\n" +
                "            \"pos\": \"12\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 692890,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.872\",\n" +
                "            \"gap\": \"+2.732\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andr&#225;s Boz&#243;ti\",\n" +
                "            \"pos\": \"13\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 199945,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:16.906\",\n" +
                "            \"gap\": \"+2.766\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Erik Harken\",\n" +
                "            \"pos\": \"14\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"us\",\n" +
                "            \"IDM\": 428277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.031\",\n" +
                "            \"gap\": \"+2.891\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Martti Kaasik\",\n" +
                "            \"pos\": \"15\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"ee\",\n" +
                "            \"IDM\": 349054,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.152\",\n" +
                "            \"gap\": \"+3.012\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Fabio Zambetta\",\n" +
                "            \"pos\": \"16\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 299911,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.205\",\n" +
                "            \"gap\": \"+3.065\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominik Krowiak\",\n" +
                "            \"pos\": \"17\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 12314,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.244\",\n" +
                "            \"gap\": \"+3.104\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Branislav Mihi&#263;\",\n" +
                "            \"pos\": \"18\",\n" +
                "            \"tyre\": \"Bridgerock\",\n" +
                "            \"natCode\": \"dk\",\n" +
                "            \"IDM\": 848438,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:17.259\",\n" +
                "            \"gap\": \"+3.119\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Apostolis Goutzos\",\n" +
                "            \"pos\": \"19\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"gr\",\n" +
                "            \"IDM\": 171261,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.317\",\n" +
                "            \"gap\": \"+3.177\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Juan Diego Mil&#225;n\",\n" +
                "            \"pos\": \"20\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"uy\",\n" +
                "            \"IDM\": 190722,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.435\",\n" +
                "            \"gap\": \"+3.295\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Petr Val&#237;&#269;ek\",\n" +
                "            \"pos\": \"21\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"cz\",\n" +
                "            \"IDM\": 270058,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.567\",\n" +
                "            \"gap\": \"+3.427\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Viktor Dyankov\",\n" +
                "            \"pos\": \"22\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"bg\",\n" +
                "            \"IDM\": 202255,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.569\",\n" +
                "            \"gap\": \"+3.429\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Justinas Bublys\",\n" +
                "            \"pos\": \"23\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"lt\",\n" +
                "            \"IDM\": 938214,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.711\",\n" +
                "            \"gap\": \"+3.571\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bart&#322;omiej Nowak\",\n" +
                "            \"pos\": \"24\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 175865,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.794\",\n" +
                "            \"gap\": \"+3.654\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Peter Both\",\n" +
                "            \"pos\": \"25\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 785482,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.818\",\n" +
                "            \"gap\": \"+3.678\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sergio Fanelli\",\n" +
                "            \"pos\": \"26\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 162844,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:17.874\",\n" +
                "            \"gap\": \"+3.734\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominiek Van West\",\n" +
                "            \"pos\": \"27\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 1967,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"1:17.892\",\n" +
                "            \"gap\": \"+3.752\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud Ferraris\",\n" +
                "            \"pos\": \"28\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 147060,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.054\",\n" +
                "            \"gap\": \"+3.914\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mark Webster\",\n" +
                "            \"pos\": \"29\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"ca\",\n" +
                "            \"IDM\": 5861,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.234\",\n" +
                "            \"gap\": \"+4.094\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Maz West\",\n" +
                "            \"pos\": \"30\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 251550,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.278\",\n" +
                "            \"gap\": \"+4.138\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pedro Moura\",\n" +
                "            \"pos\": \"31\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 205978,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.295\",\n" +
                "            \"gap\": \"+4.155\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Toni S&#246;yrinki\",\n" +
                "            \"pos\": \"32\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fi\",\n" +
                "            \"IDM\": 20271,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.303\",\n" +
                "            \"gap\": \"+4.163\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud de Marneffe\",\n" +
                "            \"pos\": \"33\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 165277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.395\",\n" +
                "            \"gap\": \"+4.255\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Craig Templeman\",\n" +
                "            \"pos\": \"34\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"en\",\n" +
                "            \"IDM\": 6991,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.452\",\n" +
                "            \"gap\": \"+4.312\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ma&#235;l Pallot\",\n" +
                "            \"pos\": \"35\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 829411,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.761\",\n" +
                "            \"gap\": \"+4.621\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mihaly Horvath\",\n" +
                "            \"pos\": \"36\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"ro\",\n" +
                "            \"IDM\": 910684,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.782\",\n" +
                "            \"gap\": \"+4.642\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Patryk Janczak\",\n" +
                "            \"pos\": \"37\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 143401,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.872\",\n" +
                "            \"gap\": \"+4.732\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kuba Szajbel\",\n" +
                "            \"pos\": \"38\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 231989,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:18.919\",\n" +
                "            \"gap\": \"+4.779\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mateusz Zaborny\",\n" +
                "            \"pos\": \"39\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 24153,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:19.353\",\n" +
                "            \"gap\": \"+5.213\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Diogo Schwinn\",\n" +
                "            \"pos\": \"40\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 664352,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"1:19.482\",\n" +
                "            \"gap\": \"+5.342\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"sgData\": [\n" +
                "        {\n" +
                "            \"name\": \"Joaqu&#237;n Quintana\",\n" +
                "            \"pos\": \"1\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 22881,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:27.693\",\n" +
                "            \"gap\": \"+0.000\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Paulo Pinto\",\n" +
                "            \"pos\": \"2\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"pt\",\n" +
                "            \"IDM\": 155479,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"2:28.983\",\n" +
                "            \"gap\": \"+1.290\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andrea Squizzato\",\n" +
                "            \"pos\": \"3\",\n" +
                "            \"tyre\": \"Hancock\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 11391,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"2:30.133\",\n" +
                "            \"gap\": \"+2.440\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kristijan Mihovic\",\n" +
                "            \"pos\": \"4\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hr\",\n" +
                "            \"IDM\": 671001,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:30.360\",\n" +
                "            \"gap\": \"+2.667\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Antonio Gattulli\",\n" +
                "            \"pos\": \"5\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 370032,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:30.448\",\n" +
                "            \"gap\": \"+2.755\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Jean-marc Boissinot\",\n" +
                "            \"pos\": \"6\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 717393,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:30.465\",\n" +
                "            \"gap\": \"+2.772\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pablo Fernandez\",\n" +
                "            \"pos\": \"7\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"es\",\n" +
                "            \"IDM\": 773224,\n" +
                "            \"champs\": \"3\",\n" +
                "            \"lapTime\": \"2:31.049\",\n" +
                "            \"gap\": \"+3.356\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gerg&#337; Csern&#225;toni\",\n" +
                "            \"pos\": \"8\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 583077,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:31.721\",\n" +
                "            \"gap\": \"+4.028\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Brice Meyer\",\n" +
                "            \"pos\": \"9\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 699900,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:32.447\",\n" +
                "            \"gap\": \"+4.754\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Harsh Sheth\",\n" +
                "            \"pos\": \"10\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"in\",\n" +
                "            \"IDM\": 325798,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:32.592\",\n" +
                "            \"gap\": \"+4.899\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Lorenzo Di Buono\",\n" +
                "            \"pos\": \"11\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 690952,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"2:32.709\",\n" +
                "            \"gap\": \"+5.016\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Branislav Mihi&#263;\",\n" +
                "            \"pos\": \"12\",\n" +
                "            \"tyre\": \"Bridgerock\",\n" +
                "            \"natCode\": \"dk\",\n" +
                "            \"IDM\": 848438,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"2:32.891\",\n" +
                "            \"gap\": \"+5.198\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Andr&#225;s Boz&#243;ti\",\n" +
                "            \"pos\": \"13\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 199945,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.048\",\n" +
                "            \"gap\": \"+5.355\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Gy&#246;rgy Sz&#233;kely\",\n" +
                "            \"pos\": \"14\",\n" +
                "            \"tyre\": \"Michelini\",\n" +
                "            \"natCode\": \"hu\",\n" +
                "            \"IDM\": 692890,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.182\",\n" +
                "            \"gap\": \"+5.489\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominik Krowiak\",\n" +
                "            \"pos\": \"15\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 12314,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.381\",\n" +
                "            \"gap\": \"+5.688\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Fabio Zambetta\",\n" +
                "            \"pos\": \"16\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 299911,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.447\",\n" +
                "            \"gap\": \"+5.754\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Apostolis Goutzos\",\n" +
                "            \"pos\": \"17\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"gr\",\n" +
                "            \"IDM\": 171261,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.807\",\n" +
                "            \"gap\": \"+6.114\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Erik Harken\",\n" +
                "            \"pos\": \"18\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"us\",\n" +
                "            \"IDM\": 428277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:33.851\",\n" +
                "            \"gap\": \"+6.158\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Juan Diego Mil&#225;n\",\n" +
                "            \"pos\": \"19\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"uy\",\n" +
                "            \"IDM\": 190722,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.001\",\n" +
                "            \"gap\": \"+6.308\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Petr Val&#237;&#269;ek\",\n" +
                "            \"pos\": \"20\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"cz\",\n" +
                "            \"IDM\": 270058,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.076\",\n" +
                "            \"gap\": \"+6.383\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Justinas Bublys\",\n" +
                "            \"pos\": \"21\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"lt\",\n" +
                "            \"IDM\": 938214,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.230\",\n" +
                "            \"gap\": \"+6.537\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Viktor Dyankov\",\n" +
                "            \"pos\": \"22\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"bg\",\n" +
                "            \"IDM\": 202255,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.299\",\n" +
                "            \"gap\": \"+6.606\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Peter Both\",\n" +
                "            \"pos\": \"23\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 785482,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.695\",\n" +
                "            \"gap\": \"+7.002\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Maz West\",\n" +
                "            \"pos\": \"24\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"nl\",\n" +
                "            \"IDM\": 251550,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.752\",\n" +
                "            \"gap\": \"+7.059\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Sergio Fanelli\",\n" +
                "            \"pos\": \"25\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"it\",\n" +
                "            \"IDM\": 162844,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.767\",\n" +
                "            \"gap\": \"+7.074\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Martti Kaasik\",\n" +
                "            \"pos\": \"26\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"ee\",\n" +
                "            \"IDM\": 349054,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.775\",\n" +
                "            \"gap\": \"+7.082\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud Ferraris\",\n" +
                "            \"pos\": \"27\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 147060,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.805\",\n" +
                "            \"gap\": \"+7.112\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Dominiek Van West\",\n" +
                "            \"pos\": \"28\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 1967,\n" +
                "            \"champs\": \"1\",\n" +
                "            \"lapTime\": \"2:34.842\",\n" +
                "            \"gap\": \"+7.149\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Bart&#322;omiej Nowak\",\n" +
                "            \"pos\": \"29\",\n" +
                "            \"tyre\": \"Badyear\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 175865,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:34.983\",\n" +
                "            \"gap\": \"+7.290\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Toni S&#246;yrinki\",\n" +
                "            \"pos\": \"30\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"fi\",\n" +
                "            \"IDM\": 20271,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:35.168\",\n" +
                "            \"gap\": \"+7.475\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Pedro Moura\",\n" +
                "            \"pos\": \"31\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 205978,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:35.297\",\n" +
                "            \"gap\": \"+7.604\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Patryk Janczak\",\n" +
                "            \"pos\": \"32\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 143401,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:35.834\",\n" +
                "            \"gap\": \"+8.141\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mark Webster\",\n" +
                "            \"pos\": \"33\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"ca\",\n" +
                "            \"IDM\": 5861,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:35.904\",\n" +
                "            \"gap\": \"+8.211\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Arnaud de Marneffe\",\n" +
                "            \"pos\": \"34\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"be\",\n" +
                "            \"IDM\": 165277,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:36.264\",\n" +
                "            \"gap\": \"+8.571\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mihaly Horvath\",\n" +
                "            \"pos\": \"35\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"ro\",\n" +
                "            \"IDM\": 910684,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:36.316\",\n" +
                "            \"gap\": \"+8.623\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Craig Templeman\",\n" +
                "            \"pos\": \"36\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"en\",\n" +
                "            \"IDM\": 6991,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:36.390\",\n" +
                "            \"gap\": \"+8.697\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Ma&#235;l Pallot\",\n" +
                "            \"pos\": \"37\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"fr\",\n" +
                "            \"IDM\": 829411,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:36.801\",\n" +
                "            \"gap\": \"+9.108\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Diogo Schwinn\",\n" +
                "            \"pos\": \"38\",\n" +
                "            \"tyre\": \"Contimental\",\n" +
                "            \"natCode\": \"br\",\n" +
                "            \"IDM\": 664352,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:37.098\",\n" +
                "            \"gap\": \"+9.405\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Kuba Szajbel\",\n" +
                "            \"pos\": \"39\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 231989,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:37.306\",\n" +
                "            \"gap\": \"+9.613\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Mateusz Zaborny\",\n" +
                "            \"pos\": \"40\",\n" +
                "            \"tyre\": \"Pipirelli\",\n" +
                "            \"natCode\": \"pl\",\n" +
                "            \"IDM\": 24153,\n" +
                "            \"champs\": \"0\",\n" +
                "            \"lapTime\": \"2:37.549\",\n" +
                "            \"gap\": \"+9.856\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"apiRequestsRemaining\": 82\n" +
                "}";

        StartingGrid startingGrid = objectMapper.readValue(startingGridResults, StartingGrid.class);
        return Mono.just(startingGrid);
    }
}
