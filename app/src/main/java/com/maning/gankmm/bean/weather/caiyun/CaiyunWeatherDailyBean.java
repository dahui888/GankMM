package com.maning.gankmm.bean.weather.caiyun;

import com.google.gson.annotations.SerializedName;

/**
 * @author : maning
 * @date : 2020-10-14
 * @desc :
 */
public class CaiyunWeatherDailyBean extends CaiyunWeatherBaseBean {

    /**
     * result : {"realtime":{"status":"ok","temperature":21.16,"humidity":0.79,"cloudrate":0.3,"skycon":"PARTLY_CLOUDY_NIGHT","visibility":9.08,"dswrf":119.8,"wind":{"speed":27.96,"direction":67.26},"pressure":100045.89,"apparent_temperature":18.2,"precipitation":{"local":{"status":"ok","datasource":"gfs","intensity":0}},"air_quality":{"pm25":6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":14,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":5,"desc":"舒适"}}},"primary":0}
     */

    private ResultEntity result;

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public static class ResultEntity {
        /**
         * realtime : {"status":"ok","temperature":21.16,"humidity":0.79,"cloudrate":0.3,"skycon":"PARTLY_CLOUDY_NIGHT","visibility":9.08,"dswrf":119.8,"wind":{"speed":27.96,"direction":67.26},"pressure":100045.89,"apparent_temperature":18.2,"precipitation":{"local":{"status":"ok","datasource":"gfs","intensity":0}},"air_quality":{"pm25":6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":14,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":5,"desc":"舒适"}}}
         * primary : 0
         */

        private RealtimeEntity realtime;
        private int primary;

        public RealtimeEntity getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeEntity realtime) {
            this.realtime = realtime;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public static class RealtimeEntity {
            /**
             * status : ok
             * temperature : 21.16
             * humidity : 0.79
             * cloudrate : 0.3
             * skycon : PARTLY_CLOUDY_NIGHT
             * visibility : 9.08
             * dswrf : 119.8
             * wind : {"speed":27.96,"direction":67.26}
             * pressure : 100045.89
             * apparent_temperature : 18.2
             * precipitation : {"local":{"status":"ok","datasource":"gfs","intensity":0}}
             * air_quality : {"pm25":6,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":14,"usa":0},"description":{"usa":"","chn":"优"}}
             * life_index : {"ultraviolet":{"index":0,"desc":"无"},"comfort":{"index":5,"desc":"舒适"}}
             */

            @SerializedName("status")
            private String statusX;
            private double temperature;
            private double humidity;
            private double cloudrate;
            private String skycon;
            private double visibility;
            private double dswrf;
            private WindEntity wind;
            private double pressure;
            private double apparent_temperature;
            private PrecipitationEntity precipitation;
            private AirQualityEntity air_quality;
            private LifeIndexEntity life_index;

            public String getStatusX() {
                return statusX;
            }

            public void setStatusX(String statusX) {
                this.statusX = statusX;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public String getSkycon() {
                return skycon;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getDswrf() {
                return dswrf;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public WindEntity getWind() {
                return wind;
            }

            public void setWind(WindEntity wind) {
                this.wind = wind;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getApparent_temperature() {
                return apparent_temperature;
            }

            public void setApparent_temperature(double apparent_temperature) {
                this.apparent_temperature = apparent_temperature;
            }

            public PrecipitationEntity getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(PrecipitationEntity precipitation) {
                this.precipitation = precipitation;
            }

            public AirQualityEntity getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityEntity air_quality) {
                this.air_quality = air_quality;
            }

            public LifeIndexEntity getLife_index() {
                return life_index;
            }

            public void setLife_index(LifeIndexEntity life_index) {
                this.life_index = life_index;
            }

            public static class WindEntity {
                /**
                 * speed : 27.96
                 * direction : 67.26
                 */

                private double speed;
                private double direction;

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }
            }

            public static class PrecipitationEntity {
                /**
                 * local : {"status":"ok","datasource":"gfs","intensity":0}
                 */

                private LocalEntity local;

                public LocalEntity getLocal() {
                    return local;
                }

                public void setLocal(LocalEntity local) {
                    this.local = local;
                }

                public static class LocalEntity {
                    /**
                     * status : ok
                     * datasource : gfs
                     * intensity : 0
                     */

                    @SerializedName("status")
                    private String statusX;
                    private String datasource;
                    private int intensity;

                    public String getStatusX() {
                        return statusX;
                    }

                    public void setStatusX(String statusX) {
                        this.statusX = statusX;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public int getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(int intensity) {
                        this.intensity = intensity;
                    }
                }
            }

            public static class AirQualityEntity {
                /**
                 * pm25 : 6
                 * pm10 : 0
                 * o3 : 0
                 * so2 : 0
                 * no2 : 0
                 * co : 0
                 * aqi : {"chn":14,"usa":0}
                 * description : {"usa":"","chn":"优"}
                 */

                private int pm25;
                private int pm10;
                private int o3;
                private int so2;
                private int no2;
                private int co;
                private AqiEntity aqi;
                private DescriptionEntity description;

                public int getPm25() {
                    return pm25;
                }

                public void setPm25(int pm25) {
                    this.pm25 = pm25;
                }

                public int getPm10() {
                    return pm10;
                }

                public void setPm10(int pm10) {
                    this.pm10 = pm10;
                }

                public int getO3() {
                    return o3;
                }

                public void setO3(int o3) {
                    this.o3 = o3;
                }

                public int getSo2() {
                    return so2;
                }

                public void setSo2(int so2) {
                    this.so2 = so2;
                }

                public int getNo2() {
                    return no2;
                }

                public void setNo2(int no2) {
                    this.no2 = no2;
                }

                public int getCo() {
                    return co;
                }

                public void setCo(int co) {
                    this.co = co;
                }

                public AqiEntity getAqi() {
                    return aqi;
                }

                public void setAqi(AqiEntity aqi) {
                    this.aqi = aqi;
                }

                public DescriptionEntity getDescription() {
                    return description;
                }

                public void setDescription(DescriptionEntity description) {
                    this.description = description;
                }

                public static class AqiEntity {
                    /**
                     * chn : 14
                     * usa : 0
                     */

                    private int chn;
                    private int usa;

                    public int getChn() {
                        return chn;
                    }

                    public void setChn(int chn) {
                        this.chn = chn;
                    }

                    public int getUsa() {
                        return usa;
                    }

                    public void setUsa(int usa) {
                        this.usa = usa;
                    }
                }

                public static class DescriptionEntity {
                    /**
                     * usa :
                     * chn : 优
                     */

                    private String usa;
                    private String chn;

                    public String getUsa() {
                        return usa;
                    }

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }
                }
            }

            public static class LifeIndexEntity {
                /**
                 * ultraviolet : {"index":0,"desc":"无"}
                 * comfort : {"index":5,"desc":"舒适"}
                 */

                private UltravioletEntity ultraviolet;
                private ComfortEntity comfort;

                public UltravioletEntity getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(UltravioletEntity ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public ComfortEntity getComfort() {
                    return comfort;
                }

                public void setComfort(ComfortEntity comfort) {
                    this.comfort = comfort;
                }

                public static class UltravioletEntity {
                    /**
                     * index : 0
                     * desc : 无
                     */

                    private int index;
                    private String desc;

                    public int getIndex() {
                        return index;
                    }

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ComfortEntity {
                    /**
                     * index : 5
                     * desc : 舒适
                     */

                    private int index;
                    private String desc;

                    public int getIndex() {
                        return index;
                    }

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }
        }
    }
}
