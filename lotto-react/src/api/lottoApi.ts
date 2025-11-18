import axiosInstance from "./axiosInstance";

export const getLottos = async (money: number) => {
  const res = await axiosInstance.post("/pick/purchase", {
    money: money,
  });

  return res.data;
};
