import axiosInstance from "./axiosInstance";

export const getLottos = async (money: number) => {
  const res = await axiosInstance.post("/pick/purchase", {
    money: money,
  });

  return res.data;
};

export const createWinnerLotto = async () => {
  const res = await axiosInstance.get("/pick/winning");

  return res.data;
};

export const checkWinLotto = async (lottos: number[][]) => {
  try {
    const res = await axiosInstance.post("/cal/winning", lottos);

    return res.data;
  } catch {
    alert("1등을 먼저 뽑아주세요");
  }
};
